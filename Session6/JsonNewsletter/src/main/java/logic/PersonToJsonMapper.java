package logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Person;

public class PersonToJsonMapper {
    private final ObjectMapper objectMapper;

    public PersonToJsonMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String personToJson(Person p) throws JsonProcessingException {
        return objectMapper.writeValueAsString(p);
    }
}
