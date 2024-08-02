package com.example.delivery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.delivery.model.Pacote;

@SpringBootApplication
public class DeliveryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pacote pacote = new Pacote();
		pacote.setDestinatario("Rafael");
		System.out.println(pacote.getDestinatario());
	}

}