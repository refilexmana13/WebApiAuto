package com.refi.api.stepDef;

import com.refi.api.baseApi.baseApi;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;

public class apiStepDef {

    private baseApi api = new baseApi();
    private Response response;
    private String savedUserID; //untuk menampung ID
    private File jsonSchema = new  File("src/test/resources/JsonSchema/GetJsonSchema.json");
    String invalidID = "69ab0045eeddd63291654776";

    @Given("I have the API endpoint")
    public void iHaveTheAPIEndpoint() {
        api = new baseApi();
    }

    @When("I send a GET request to the endpoint")
    public void iSendAGETRequestToTheEndpoint() {
        response = api.getListUser();
        Assert.assertNotNull("Response is null!", response);
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }

    @Then("I should receive a {int} status code")
    public void iShouldReceiveAStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @When("I send a POST request to the endpoint with user data")
    public void iSendAPOSTRequestToTheEndpointWithUserData() {
        String email = "random" + System.currentTimeMillis() + "@yopmail.com";
        response = api.createUser("Rey", "Mysterio", email);

        // simpen ID
        savedUserID = response.jsonPath().getString("id");

        //mengambil data dari response body
        String firstName = response.jsonPath().getString("firstName");
        String lastName = response.jsonPath().getString("lastName");

        Assert.assertEquals("Rey", firstName);
        Assert.assertEquals("Mysterio", lastName);
    }


    @When("I send a GET request by ID to the endpoint")
    public void iSendAGETRequestByIDToTheEndpoint() {
        response = api.getUserByID();

    }

    @And("I should see the name")
    public void iShouldSeeTheName() {
        String firstName = response.jsonPath().getString("firstName");
        Assert.assertEquals("Randy", firstName);
    }

    @And("I send a PUT request to the endpoint")
    public void iSendAPUTRequestToTheEndpoint() {
        String dynamicUsername = "Rey" + System.currentTimeMillis();
        response = api.updateUser(savedUserID, dynamicUsername);
    }

    @And("I Send a DELETE request to the endpoint")
    public void iSendADELETERequestToTheEndpoint() {
        System.out.println("Menghapus User dengan ID -> " + savedUserID);
        response = api.deleteUser(savedUserID);

    }

    @And("I Send a DELETE request with invalid ID")
    public void iSendADELETERequestWithInvalidID() {
        System.out.println("Menghapus User dengan ID -> " + invalidID);
        response = api.deleteUser(invalidID);
    }
}
