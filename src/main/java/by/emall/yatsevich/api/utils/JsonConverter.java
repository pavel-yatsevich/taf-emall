package by.emall.yatsevich.api.utils;

import by.emall.yatsevich.api.dto.ResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonConverter {

    public static ResponseDTO getResponseDTOFromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, ResponseDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getJsonFromObject(Object clazz) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getJsonFromMap(Map<String,Object> objectMap) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(objectMap);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
