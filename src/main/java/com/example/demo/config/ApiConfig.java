package com.example.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    /*
     * ObjectMapper will define how JSON strings in the request body are deserialized from requests in POJOs
     * (Plain Old Java Objects) which we use to model our data.
     */
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper
                .registerModule(new JavaTimeModule());

        return new ObjectMapper();
    }


    /*
     * It uses ObjectMapper to create a Default PrettyPrinter which will output JSON
     */
    @Bean
    public ObjectWriter objectWriter(ObjectMapper objectMapper){
        return objectMapper.writerWithDefaultPrettyPrinter();
    }
}
