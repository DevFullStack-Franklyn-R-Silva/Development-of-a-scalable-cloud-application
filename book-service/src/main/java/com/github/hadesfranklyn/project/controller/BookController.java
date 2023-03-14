package com.github.hadesfranklyn.project.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.hadesfranklyn.project.model.Book;
import com.github.hadesfranklyn.project.proxy.CambioProxy;
import com.github.hadesfranklyn.project.repository.BookRepository;
import com.github.hadesfranklyn.project.response.Cambio;

@RestController
@RequestMapping("book-service")
public class BookController {

	@Autowired
	private BookRepository repository;

	@Autowired
	private Environment environment;

	@Autowired
	private CambioProxy proxy;

	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

		@SuppressWarnings("deprecation")
		var book = repository.getById(id);

		if (book == null)
			throw new RuntimeException("Book not Found");

		var cambio = proxy.getCambio(book.getPrice(), "USD", currency);

		var port = environment.getProperty("local.server.port");
		book.setEnviroment(port + " FEING");
		book.setPrice(cambio.getConvertedValue());
		return book;
	}
	
	/**
	// http://localhost:8100/book-service/14/BRL
	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

		@SuppressWarnings("deprecation")
		var book = repository.getById(id);

		if (book == null)
			throw new RuntimeException("Book not Found");

		HashMap<String, String> params = new HashMap<>();
		params.put("amount", book.getPrice().toString());
		params.put("from", "USD");
		params.put("to", currency);

		var response = new RestTemplate().getForEntity("http://localhost:8000/cambio-service/{amount}/{from}/{to}",
				Cambio.class, params);

		var cambio = response.getBody(); // extract the exchange

		var port = environment.getProperty("local.server.port");
		book.setEnviroment(port);
		book.setPrice(cambio.getConvertedValue());
		return book;
	}
	*/
}
