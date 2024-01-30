package com.bedu.example0.config;

import com.bedu.example0.model.Usuario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
    @Bean
    public Usuario usuario(){
        return new Usuario();
    }
}
