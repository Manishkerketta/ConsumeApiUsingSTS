package com.consumeapi.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Consumeapi2Application {

	
	@Bean
	
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(Consumeapi2Application.class, args);
	}

}
