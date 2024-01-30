package com.bedu.example0.config;

import com.bedu.example0.model.Usuario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.bedu")
//  Spring automáticamente encontrará clases anotadas con 
// @Component, @Service, @Repository, y @Controller dentro del paquete especificado y las gestionará.
public class AutomaticConfigurationApp {
    
}
