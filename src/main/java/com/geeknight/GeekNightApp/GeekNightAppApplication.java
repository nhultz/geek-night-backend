package com.geeknight.GeekNightApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GeekNightAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeekNightAppApplication.class, args);
	}
}
