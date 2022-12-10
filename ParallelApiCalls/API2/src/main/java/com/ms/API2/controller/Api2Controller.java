package com.ms.API2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class Api2Controller {
	
	@GetMapping("/getApi2Data")
    public ResponseEntity<String> fetchEmpById() {
        return ResponseEntity.ok("API 2 Data");
    }

}
