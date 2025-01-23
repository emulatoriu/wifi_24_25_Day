package logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Employee;

public class EmployeeToJsonMapper {
    private final ObjectMapper objectMapper;

    public EmployeeToJsonMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String employeeToJson(Employee employee) throws JsonProcessingException {
        return objectMapper.writeValueAsString(employee);
    }
}
