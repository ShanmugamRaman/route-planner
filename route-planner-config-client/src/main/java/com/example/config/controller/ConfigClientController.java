package com.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${Chennai}") String chennaiCode;
	
	@GetMapping
	public String getWordFromConfigServer() {
		return "Chennai from config server : "+chennaiCode;
	}

}
