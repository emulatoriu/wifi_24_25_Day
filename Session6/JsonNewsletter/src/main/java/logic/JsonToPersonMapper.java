package logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Person;

public class JsonToPersonMapper {
    private final ObjectMapper objectMapper;

    public JsonToPersonMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Person jsonToPerson(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Person.class);
    }
}
