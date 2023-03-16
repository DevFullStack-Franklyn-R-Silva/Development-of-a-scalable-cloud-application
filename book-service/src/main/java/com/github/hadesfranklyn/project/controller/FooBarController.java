package com.github.hadesfranklyn.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-service")
public class FooBarController {

	@GetMapping("/foo-bar")
	public String fooBar() {
		return "Foo-Bar!!!";
	}
}
