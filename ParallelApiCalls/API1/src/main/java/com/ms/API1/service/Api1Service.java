package com.ms.API1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Api1Service {

	@Autowired
	Api1SeriesRestCalls api1SeriesRestCalls;

	@Autowired
	Api1ParallelRestCalls api1ParallelRestCalls;

	public List<String> seriesCallData() {
		List<String> finalSeriesList = new ArrayList<>();
		finalSeriesList.add(api1SeriesRestCalls.getApi2SyncData());
		finalSeriesList.add(api1SeriesRestCalls.getApi3SyncData());
		finalSeriesList.add(api1SeriesRestCalls.getApi4SyncData());
		return finalSeriesList;
	}

	public List<String> parallelCallData() {
		List<String> finalParallelList = new ArrayList<>();

		CompletableFuture<String> api2data = api1ParallelRestCalls.getApi2SyncData();
		CompletableFuture<String> api3data = api1ParallelRestCalls.getApi3SyncData();
		CompletableFuture<String> api4data = api1ParallelRestCalls.getApi4SyncData();

		finalParallelList = Stream.of(api2data, api3data, api4data).map(CompletableFuture::join)
				.collect(Collectors.toList());

		return finalParallelList;
	}

}
