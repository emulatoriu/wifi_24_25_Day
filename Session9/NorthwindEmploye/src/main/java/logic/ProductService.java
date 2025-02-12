package logic;

import data.Employee;
import data.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ResultToList<Product> {
    @Override
    public List<Product> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Product> products = new ArrayList<>();
        while(resultSet.next()) {
            String productName = resultSet.getString("productName");
            double unitPrice = resultSet.getDouble("unitPrice");
            products.add(new Product(productName, unitPrice));
        }
        return products;
    }
}
