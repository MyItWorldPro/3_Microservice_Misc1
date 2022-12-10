package com.ms.API1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.API1.service.Api1Service;

@RestController
@RequestMapping("/api1")
public class Api1Controller {
	
	@Autowired
	Api1Service api1Service;

	@GetMapping("/getSeriesCallData")
    public ResponseEntity<List<String>> getSeriesCallData() {
        return ResponseEntity.ok(api1Service.seriesCallData());
    }
	
	@GetMapping("/getParallelCallData")
    public ResponseEntity<String> getParallelCallData() {

        return ResponseEntity.ok("getParallelCallData");
    }
	
}
