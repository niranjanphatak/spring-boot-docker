package com.niranjan.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dockerapp")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld() {
	
		return "Hello World";
	}
	
}
