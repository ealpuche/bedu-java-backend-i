package com.bedu.example1.config;

import com.bedu.example1.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {

    @Bean
    public Usuario usuario(){
        return new Usuario();
    }



}
