package com.sample.geolocation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @author jairam_gauns
 * @implNote Class contains <b>Swagger Configuration</b>
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Geo  LocationService")
                        .version("v1.0.0")
                        .description("This service will provide the Latitude/Longitude for a given address.")
                        .termsOfService("Terms of Service")
                        .license(getLicense())
                        .contact(getContact())
                );

    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.setEmail("account_type_admin@dummy");
        contact.setName("Dummy Name");
        contact.setUrl("dummy data");
        contact.setExtensions(Collections.emptyMap());
        return contact;
    }

    private License getLicense() {
        License license = new License();
        license.setName("API License");
        license.setUrl("API license URL");
        license.setExtensions(Collections.emptyMap());
        return license;
    }

}