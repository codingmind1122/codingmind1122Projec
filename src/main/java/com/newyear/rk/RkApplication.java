package com.newyear.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RkApplication.class, args);
		System.out.println("---------------running---------------");
	}

	@Bean
	 RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	 WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET","POST","PUT","DELETE", "PATCH");
			}
		};
	}
	
}

