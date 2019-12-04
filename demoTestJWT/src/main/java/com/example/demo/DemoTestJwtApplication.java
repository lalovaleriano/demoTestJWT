package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoTestJwtApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(DemoTestJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pass= "1234";
		for(int i =0;i<5;i++) {
			String passencode = passwordEncoder.encode(pass);
			System.out.println(passencode);
		}
		
	}

}
