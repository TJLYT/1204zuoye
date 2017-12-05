package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Learn12021Application  extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(Learn12021Application.class, args);
	}
}
