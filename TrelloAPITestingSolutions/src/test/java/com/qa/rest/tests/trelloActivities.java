package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class trelloActivities {
	

	@Test(priority = 1, enabled = false)
	public void CreateBoard() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("name", "Automation Board").contentType(ContentType.JSON)

				.when().post("/1/boards/").then().log().all().assertThat().statusCode(200);
	}

	@Test(priority = 2, enabled = false)
	public void getBoardDetails() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().accept("application/json").log().all().queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("id", "62f171c81f708e0b9c0373d0").accept("application/json").contentType(ContentType.JSON)
				.when().get("/1/members/me/").then().log().all().assertThat().statusCode(200);
	}

	@Test(priority = 3, enabled = false)
	public void updateBoardDetails() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().accept("application/json").queryParam("id", "62f171c81f708e0b9c0373d0")
				.queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("name", "Automation Board").contentType(ContentType.JSON)

				.when().put("/1/members/me/").then().log().all().assertThat().statusCode(200);

	}

	@Test(priority = 4, enabled = false)
	public void createCard() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().accept("application/json")
				.queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				.queryParam("idList", "62f1715508c60f00f544cc5e").contentType(ContentType.JSON)

				.when().post("/1/cards/").then().log().all().assertThat().statusCode(200);

	}

	@Test(priority = 5)
	public void updateCard() {

		RestAssured.baseURI = "https://api.trello.com";
		RestAssured.given().log().all().accept("application/json").queryParam("id", "62f190359dd98675854133e5?")
		
				.queryParam("key", "64e77aa3c45d329f3581f1f557bc2c94")
				.queryParam("token", "66c0080e4e17ece1f28bfa64f6ebc4c672e58f62fdce974100391424323c4643")
				
				
				.contentType(ContentType.JSON)

				.when().get("/1/cards/{id}").then().log().all().assertThat().statusCode(200);
		//.queryParam("idMembers", "62e8450f723a09328d1bf2dc")

	}
}
