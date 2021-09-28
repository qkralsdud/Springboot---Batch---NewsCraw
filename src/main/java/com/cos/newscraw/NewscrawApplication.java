package com.cos.newscraw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NewscrawApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewscrawApplication.class, args);
	}

}
