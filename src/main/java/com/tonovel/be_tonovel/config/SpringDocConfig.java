package com.tonovel.be_tonovel.config;// SpringDocConfig.java (opzionale se vuoi personalizzare il titolo)
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Tonovel Backend API")
                .version("1.0")
                .description("Documentazione delle API REST per il progetto Tonovel"));
    }
}
