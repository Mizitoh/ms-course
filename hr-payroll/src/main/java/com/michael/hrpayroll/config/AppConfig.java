package com.michael.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() {
		//registra uma instancia unica (singleton do tipo RestTemplate
		//não será instanciado na classe e sim pela chamado do método, por isso o bean annotation
		return new RestTemplate();
	}
}
