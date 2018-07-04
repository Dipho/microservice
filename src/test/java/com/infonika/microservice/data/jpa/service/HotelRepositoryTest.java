package com.infonika.microservice.data.jpa.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infonika.microservice.data.jpa.SampleDataRestApplication;
import com.infonika.microservice.data.jpa.domain.City;
import com.infonika.microservice.data.jpa.domain.Hotel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataRestApplication.class)
public class HotelRepositoryTest {
	@Autowired
	CityRepository repository;
	
	@Autowired
	HotelRepository repository2;
	
	@Test
	public void FindFirstHotel() {
		City city = this.repository.findByNameAndCountryAllIgnoringCase("Brisbane", "Australia");
		Hotel hot = this.repository2.findByCityAndName(city, "Conrad Treasury Place");
		assertThat(hot.getZip()).isEqualTo("4001");
	}
}
