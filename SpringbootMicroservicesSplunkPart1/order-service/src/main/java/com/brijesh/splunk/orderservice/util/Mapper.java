package com.brijesh.splunk.orderservice.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {

    public static String mapToJasonString(Object obj){
        try {
            return new ObjectMapper().writeValueAsString(obj);
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
