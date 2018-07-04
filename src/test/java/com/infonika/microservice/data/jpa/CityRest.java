package com.infonika.microservice.data.jpa;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class CityRest extends FunctionalTest{
	@Test
	public void basicPingTest() {
		given().when().get("/cities").then().statusCode(200);
	}
	
	@Test
    public void invalidParkingSpace() {
        given().when().get("/cities/999")
            .then().statusCode(404);
    }	
}
