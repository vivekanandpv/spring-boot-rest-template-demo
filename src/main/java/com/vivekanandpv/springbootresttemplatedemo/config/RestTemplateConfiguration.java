package com.vivekanandpv.springbootresttemplatedemo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    private final RestTemplateBuilder restTemplateBuilder;

    public RestTemplateConfiguration(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return restTemplateBuilder
                .rootUri("http://localhost:9000/api/v1")
                .build();
    }
}
