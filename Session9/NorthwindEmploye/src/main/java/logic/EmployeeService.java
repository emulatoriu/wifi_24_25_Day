package logic;

import data.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements ResultToList {
    public List<Employee> resultSetToList(ResultSet resultSet) throws SQLException {
//        String tableName = resultSet.getMetaData().getTableName(1);
//        if(!tableName
//                .equalsIgnoreCase("employee")) return List.of();
        List<Employee> employees = new ArrayList<>();
        while(resultSet.next()) {
            String firstname = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            LocalDate birthDate = resultSet.getDate("birthDate").toLocalDate();
            employees.add(new Employee(firstname, lastname, birthDate));
        }
        return employees;
    }
}
