package com.zensar.services.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //marks spring class as restful
@RequestMapping("/hello")
public class HelloService {
   @GetMapping
	public String sayHello() {
		
		return "Hello Form Sakshi Tiwari";
	}
	
}
