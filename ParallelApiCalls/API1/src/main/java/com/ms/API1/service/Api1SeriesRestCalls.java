package com.ms.API1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Api1SeriesRestCalls {

RestTemplate restTemplate = new RestTemplate();
	
	@Value("${api2.url}")
	private String api2Url;
	
	@Value("${api3.url}")
	private String api3Url;
	
	@Value("${api4.url}")
	private String api4Url;
	

	public String getApi2SyncData() {
		String api2Data = null;
		
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		ResponseEntity<String> api2Resp = 
				restTemplate.exchange(api2Url, HttpMethod.GET, entity, String.class);
		api2Data = api2Resp.getBody();
		
		return api2Data;
	}
	
	public String getApi3SyncData() {
		String api3Data = null;
		
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		ResponseEntity<String> api3Resp = 
				restTemplate.exchange(api3Url, HttpMethod.GET, entity, String.class);
		api3Data = api3Resp.getBody();
		
		return api3Data;
	}
	
	public String getApi4SyncData() {
		String api4Data = null;
		
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		ResponseEntity<String> api4Resp = 
				restTemplate.exchange(api4Url, HttpMethod.GET, entity, String.class);
		api4Data = api4Resp.getBody();
		
		return api4Data;
	}
	
}
