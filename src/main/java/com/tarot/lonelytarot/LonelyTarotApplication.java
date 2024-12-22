package com.tarot.lonelytarot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tarot.lonelytarot")
public class LonelyTarotApplication {

	public static void main(String[] args) {
		SpringApplication.run(LonelyTarotApplication.class, args);
	}

}
