package logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Employee;

public class JsonToEmployeeMapper {
    private final ObjectMapper objectMapper;

    public JsonToEmployeeMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Employee jsonToEmployee(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Employee.class);
    }
}
