import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Employee;
import logic.EmployeeToJsonMapper;
import logic.JsonToEmployeeMapper;

public class Application {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        var employeeToJsonMapper = new EmployeeToJsonMapper(objectMapper);
        var jsonToEmployeeMapper = new JsonToEmployeeMapper(objectMapper);
        Employee emad = new Employee("Emad", "Easa", 41);
        try {
            String json = employeeToJsonMapper.employeeToJson(emad);
            System.out.println(json);
            Employee emadConverted = jsonToEmployeeMapper.jsonToEmployee(json);
            System.out.println(emadConverted);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
