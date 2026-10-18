package com.javademo.spring_boot_tutorial.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public Map<String, String> index() {
		return Map.of(
				"message", "Spring Boot API is running",
				"try", "GET /api/hello");
	}

	@GetMapping("/api/hello")
	public Map<String, String> hello() {
		return Map.of("message", "Hello from Spring Boot API!");
	}
}