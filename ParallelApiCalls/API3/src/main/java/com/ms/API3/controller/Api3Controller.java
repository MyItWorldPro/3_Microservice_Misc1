package com.ms.API3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api3")
public class Api3Controller {

	@GetMapping("/getApi3Data")
    public ResponseEntity<String> getApi3Data() throws InterruptedException {
		Thread.sleep(5000); //sleep for 5 seconds
        return ResponseEntity.ok("API 3 Data");
    }
	
}
