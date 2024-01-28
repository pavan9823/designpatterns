package com.structural;

import com.structural.decorator.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StructuralApplication {

	public static void main(String[] args) {
		Client.main(args);
		SpringApplication.run(StructuralApplication.class, args);
	}


}
