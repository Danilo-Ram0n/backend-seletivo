package com.example.backendseletivo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    // Configuração para permitir CORS em todos os endpoints
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*"); // Permitir de qualquer origem
        config.addAllowedHeader("*"); // Permitir todos os cabeçalhos
        config.addAllowedMethod("*"); // Permitir todos os métodos (GET, POST, PUT, etc.)
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
