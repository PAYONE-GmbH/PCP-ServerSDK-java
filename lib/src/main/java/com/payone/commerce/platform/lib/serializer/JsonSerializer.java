package com.payone.commerce.platform.lib.serializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonSerializer {
    private static final JsonMapper JSON_MAPPER;

    static {
        JSON_MAPPER = new JsonMapper();
        JSON_MAPPER.registerModule(new JavaTimeModule());
        JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        JSON_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String serializeToJson(Object object) throws JsonProcessingException {
        return JSON_MAPPER.writeValueAsString(object);
    }

    public static <T> T deserializeFromJson(String json, Class<T> clazz)
            throws JsonMappingException, JsonProcessingException {
        return JSON_MAPPER.readValue(json, clazz);
    }

    public static <T> T deserializeFromJson(String json, TypeReference<T> valueTypeRef)
            throws JsonMappingException, JsonProcessingException {
        return JSON_MAPPER.readValue(json, valueTypeRef);
    }
}
