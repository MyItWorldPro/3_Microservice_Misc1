package com.ms.API1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Api1Application {

	public static void main(String[] args) {
		SpringApplication.run(Api1Application.class, args);
	}

}
