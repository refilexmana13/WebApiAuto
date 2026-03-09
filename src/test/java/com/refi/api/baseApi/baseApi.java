package com.refi.api.baseApi;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class baseApi {
    private String baseUrl= "https://dummyapi.io";
    private String appId = "63a804408eb0cb069b57e43a";

    //GET LIST USER
    public Response getListUser(){
        return RestAssured.given()
                .baseUri(baseUrl)
                .header("app-id", appId)
                .when()
                .get(baseUrl + "/data/v1/user");
    }

    //CREATE USER
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
                .post( "/data/v1/user/create").then().log().all().extract().response();
        }

    // GET USER BY ID
    public Response getUserByID(){
        return RestAssured.given()
                .baseUri(baseUrl).header("app-id", appId)
                .when()
                .get(baseUrl + "/data/v1/user/699fb0aedc2a4cc232711363").then().log().all().extract().response();
    }

    //UPDATE USER
    public Response updateUser(String userID, String firstName) {
        Map<String, String> body = new HashMap<>();
        body.put("firstName", firstName);

        return RestAssured.given()
                .header("app-id", appId)
                .contentType(ContentType.JSON)
                .body(body)
                .when().put(baseUrl + "/data/v1/user/" + userID) // penanda ID dikirim disini
                .then().log().all().extract().response();
    }

    // DELETE USER
    public Response deleteUser(String userID){
        return RestAssured.given()
                .baseUri(baseUrl).header("app-id", appId)
                .contentType(ContentType.JSON)
                .when()
                .delete(baseUrl + "/data/v1/user/" + userID);
    }
}
