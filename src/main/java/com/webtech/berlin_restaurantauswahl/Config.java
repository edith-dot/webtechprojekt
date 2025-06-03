package com.webtech.berlin_restaurantauswahl;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/daten")                     // HIER ist addMapping richtig
                        .allowedOrigins("http://localhost:5176")   // Vue Dev Server
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}
