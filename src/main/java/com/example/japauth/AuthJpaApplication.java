package com.example.japauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AuthJpaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AuthJpaApplication.class, args);
		
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AuthJpaApplication.class);
    }
}
//comment