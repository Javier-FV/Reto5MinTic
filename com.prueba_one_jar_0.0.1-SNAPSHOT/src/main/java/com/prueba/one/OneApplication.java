package com.prueba.one;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.prueba.one")
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
                
	}

}
