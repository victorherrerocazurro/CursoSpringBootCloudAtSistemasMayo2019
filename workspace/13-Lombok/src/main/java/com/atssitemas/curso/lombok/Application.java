package com.atssitemas.curso.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Persona victor = new Persona(1l, "Victor", "Herrero");
		
		System.out.println(victor.getId());
		
		System.out.println(victor);
		
		Persona laura = new Persona(1l, "Laura", "Herrero");
		
		if(victor.equals(laura)) {
			System.out.println("Pero como dices!!!!!");
		}
		
	}

}
