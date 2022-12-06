package ru.ann.mast.webClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("ru.ann.mast.webClient")
public class WebClientApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);

	}	
}
