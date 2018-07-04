package com.infonika.microservice.data.jpa.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infonika.microservice.data.jpa.SampleDataRestApplication;
import com.infonika.microservice.data.jpa.domain.City;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataRestApplication.class)
public class CityRepositoryTest {
	@Autowired
	CityRepository repository;
	
	@Test
	public void FindCity() {
		City city = this.repository.findByNameAndCountryAllIgnoringCase("Brisbane", "Australia");
		assertThat(city.getName()).isEqualTo("Brisbane");;
	}
}
