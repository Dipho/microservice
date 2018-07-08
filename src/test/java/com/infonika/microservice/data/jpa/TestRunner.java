package com.infonika.microservice.data.jpa;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(CityRest.class);
		System.out.println("Falhas: "+ result.getFailureCount());
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

}
