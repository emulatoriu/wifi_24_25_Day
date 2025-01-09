package employee.logic;

import employee.data.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public Map<String, String> getEmployeeEmailMap(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(
                        employee -> employee.lastName(),
                        employee -> employee.email()));
    }
}
