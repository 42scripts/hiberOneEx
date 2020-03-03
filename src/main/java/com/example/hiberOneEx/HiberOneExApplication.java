package com.example.hiberOneEx;

import com.example.hiberOneEx.services.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HiberOneExApplication {
	private final BookService bookService;

	public HiberOneExApplication(BookService bookService) {
		this.bookService = bookService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HiberOneExApplication.class, args);
	}
}
