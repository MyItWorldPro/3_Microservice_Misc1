package com.ms.API4.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api4")
public class Api4Controller {

	@GetMapping("/getApi4Data")
    public ResponseEntity<String> getApi4Data() throws InterruptedException {
		Thread.sleep(7000); //sleep for 7 seconds
        return ResponseEntity.ok("API 4 Data");
    }
	
}
