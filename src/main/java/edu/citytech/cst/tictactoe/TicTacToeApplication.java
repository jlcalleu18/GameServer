package edu.citytech.cst.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class TicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TicTacToeApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "9615"));
		app.run(args);
	}
}
