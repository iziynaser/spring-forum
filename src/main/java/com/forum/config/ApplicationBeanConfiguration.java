package com.forum.config;

import org.modelmapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class ApplicationBeanConfiguration {
    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}