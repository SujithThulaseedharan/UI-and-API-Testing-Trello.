package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class CreateBoardTests  {
	
	
	
	@Test(priority = 1)
	public void CreateBoard() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("name", "Automation Board").contentType(ContentType.JSON)

				.when().post("/1/boards/").then().log().all().assertThat().statusCode(200);
	}
}