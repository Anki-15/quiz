package com.assignment.springboot.itoquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.assignment.springboot.itoquiz")
public class ItoQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItoQuizApplication.class, args);
	}

}
