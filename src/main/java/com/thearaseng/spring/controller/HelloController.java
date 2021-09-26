package com.thearaseng.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {

	@GetMapping("/hello")
	public HashMap<String, Object> hello() {
		HashMap<String, Object> response = new HashMap<>();
		response.put("message", "Hello world");
		return response;
	}

}
