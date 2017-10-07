package com.pura.ssl.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureSampleController {

	
	@GetMapping("/SpringSSL")
	@ResponseBody
	public String sayHelloSecureWorld(){
		
		return "Hello I am secure";
	}
}
