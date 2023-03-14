package com.github.hadesfranklyn.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Book;
import com.github.hadesfranklyn.project.repository.BookRepository;

@RestController
@RequestMapping("book-service")
public class BookController {

	@Autowired
	private BookRepository repository;

	@Autowired
	private Environment environment;

	// http://localhost:8100/book-service/14/BRL
	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

		var book = repository.getById(id);

		if (book == null)
			throw new RuntimeException("Book not Found");

		var port = environment.getProperty("local.server.port");
		book.setEnviroment(port);
		return book;
	}
}
