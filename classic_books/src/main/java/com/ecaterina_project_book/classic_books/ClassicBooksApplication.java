package com.ecaterina_project_book.classic_books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassicBooksApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClassicBooksApplication.class, args);
	}

	@Bean
	public CommandLineRunner doSomething(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("say Something");
			}
		};
	}
	@Bean
	public CommandLineRunner doSomethingElse(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("say Something else");
			}
		};
	}

}
