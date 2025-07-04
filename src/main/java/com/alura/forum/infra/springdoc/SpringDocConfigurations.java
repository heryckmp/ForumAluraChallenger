package com.alura.forum.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("API Fórum Alura")
                        .description("API REST do Fórum Alura, contendo as funcionalidades de CRUD de tópicos, autenticação e autorização de usuários.")
                        .contact(new Contact()
                                .name("Erick Moreira")
                                .email("contato@erick.com")
                                .url("https://github.com/heryckmp"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://forum.alura/api/licenca")));
    }
} 