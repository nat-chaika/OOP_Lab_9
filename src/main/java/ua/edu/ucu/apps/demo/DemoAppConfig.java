package ua.edu.ucu.apps.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DemoAppConfig {
    @Bean
    private String getData(){
        return "hello";
    }
}
