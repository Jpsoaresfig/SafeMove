//classe Responsavel por executar o projeto 
package com.SafeMove.SafeMove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SafeMove")
public class SafeMoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafeMoveApplication.class, args);
	}

}
