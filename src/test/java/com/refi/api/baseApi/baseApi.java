package com.refi.api.baseApi;

import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class baseApi {
    private String baseUrl= "https://dummyapi.io";
    private static final Dotenv dotenv = Dotenv.load();
    private String apiKey = dotenv.get("app-id");

    public Response getListUser(){
        return RestAssured.given()
                .baseUri(baseUrl)
                .header("app-id", apiKey)
                .when()
                .get(baseUrl + "/data/v1/user");
    }

}
