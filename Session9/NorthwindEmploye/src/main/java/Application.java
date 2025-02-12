import data.DBConnection;
import data.Employee;
import data.Product;
import logic.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DBConnection dbConnection =
                new DBConnection(
                        "jdbc:mysql://localhost/northwind",
                        "root",
                        "");
        String selectEmployeeQuery = "SELECT * from employee";
        String selectProductQuery = "SELECT * from product";
        ResultToList<Employee> employeeService = new EmployeeService();
        ResultToList<Product> productService = new ProductService();
        DBReaderService readerServiceEmployees = new DBReaderService(employeeService);
        DBReaderService readerServiceProducts = new DBReaderService(productService);
        List<Employee> employees = readerServiceEmployees.readFromDBAndConvertToList(dbConnection, selectEmployeeQuery);
        List<Product> products = readerServiceProducts.readFromDBAndConvertToList(dbConnection, selectProductQuery);
        System.out.println(employees);
        System.out.println(products);

        Product product = new Product("banana", 2.5);
        InsertServiceProduct insertServiceProduct = new InsertServiceProduct();
        insertServiceProduct.saveProduct(dbConnection, product);
    }
}
