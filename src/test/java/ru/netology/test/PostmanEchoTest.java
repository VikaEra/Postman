package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when().log().all()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("some data"));

    }
}
