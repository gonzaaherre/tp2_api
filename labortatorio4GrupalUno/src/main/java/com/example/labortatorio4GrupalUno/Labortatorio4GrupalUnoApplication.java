package com.example.labortatorio4GrupalUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.labortatorio4GrupalUno.Entidades")
public class Labortatorio4GrupalUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Labortatorio4GrupalUnoApplication.class, args);
	}

}
