package com.in28minutes.learn_spring_framework.data_services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
	@Override
	public int[] retriveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
}
