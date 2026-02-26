package com.refi.api.baseApi;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class baseApi {
    private String baseUrl= "https://dummyapi.io";
    private String appId = "63a804408eb0cb069b57e43a";

    public Response getListUser(){
        return RestAssured.given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .when()
                .get(baseUrl + "/data/v1/user");
    }

}
