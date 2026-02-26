package com.refi.api.baseApi;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

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

    public Response createUser(String firstName, String lastName, String email){
        JSONObject obj = new JSONObject();
        obj.put("firstName", firstName);
        obj.put("lastName", lastName);
        obj.put("email", email);

        return RestAssured.given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .header("Content-Type", "application/json")
                .body(obj.toString())
                .when()
                .post(baseUrl + "/data/v1/user/create").then().log().all().extract().response();
        }

}
