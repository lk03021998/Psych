package com.psych.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages={"com.psych"})
public class GameApplication {

	public static void main(String[] args) {

		SpringApplication.run(GameApplication.class, args);
	}

}
