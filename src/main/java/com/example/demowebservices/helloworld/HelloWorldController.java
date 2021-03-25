package com.example.demowebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello Sudhir !!!";
	}
	
	@GetMapping("/hello-world-bean/{name}")
	public helloWorldBean helloWorldBean(@PathVariable String name) {
		return new helloWorldBean(String.format("Hello %s !!!", name));
	}
}
