package com.in28minutes.learn_spring_framework.data_services;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	private final DataService dataService;
	
	@Autowired 
	public BusinessCalculationService
	(@Qualifier("MySQLDataServiceQualifier")DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(this.dataService.retriveData()).boxed()
				.max(new Comparator<Integer>() {
					@Override
					public int compare(Integer int1, Integer int2) {
						// TODO Auto-generated method stub
						return Integer.compare(int1, int2);
					}			
				}).orElse(0);
	}
}
