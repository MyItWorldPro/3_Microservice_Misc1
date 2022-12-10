package com.ms.API1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Api1Service {
	
	@Autowired
	Api1SeriesRestCalls api1SeriesRestCalls;

	public List<String> seriesCallData() {
		List<String> finalSeriesList = new ArrayList<>();
		finalSeriesList.add(api1SeriesRestCalls.getApi2SyncData());
		finalSeriesList.add(api1SeriesRestCalls.getApi3SyncData());
		finalSeriesList.add(api1SeriesRestCalls.getApi4SyncData());
		return finalSeriesList;
	}
	
	public List<String> parallelCallData() {
		List<String> finalParallelList = new ArrayList<>();
		
		return finalParallelList;
	}
	
	
	
}
