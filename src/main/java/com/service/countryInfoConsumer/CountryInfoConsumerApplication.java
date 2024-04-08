package com.service.countryInfoConsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CountryInfoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryInfoConsumerApplication.class, args);
	}

	@Value("${country.info.url}")
	private String countryInfoURL;

	@Bean
	WebClient webClient(){

		return WebClient.create(countryInfoURL);

	}

}
