package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateCardTests {

	@Test(priority = 1)
	public void createCard() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().accept("application/json")
				.queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("idList", "62f1715508c60f00f544cc5e").contentType(ContentType.JSON)

				.when().post("/1/cards/").then().log().all().assertThat().statusCode(200);

	}
}
