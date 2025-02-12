package logic;

import data.DBConnection;
import data.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertServiceProduct {
    public void saveProduct(DBConnection dbConnection, Product product) {
        // insert into product values (attributes)
        String insertQuery = "insert into product (productName, supplierId, categoryId, unitPrice, discontinued)" +
                " values (?, ?, ?, ?, ?)";
        try(Connection connection = DriverManager.getConnection(
                dbConnection.url(),
                dbConnection.user(),
                dbConnection.password()
        )) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, product.productName());
            preparedStatement.setInt(2, 2);
            preparedStatement.setInt(3, 1);
            preparedStatement.setDouble(4, product.unitPrice());
            preparedStatement.setInt(5, 0);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
