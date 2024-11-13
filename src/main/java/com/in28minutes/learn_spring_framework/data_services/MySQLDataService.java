package com.in28minutes.learn_spring_framework.data_services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements DataService {
	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
