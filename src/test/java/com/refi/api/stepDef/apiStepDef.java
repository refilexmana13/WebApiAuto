package com.refi.api.stepDef;

import com.refi.api.baseApi.baseApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class apiStepDef {

    private baseApi api = new baseApi();
    private Response response;

    @Given("I have the API endpoint")
    public void iHaveTheAPIEndpoint() {

    }

    @When("I send a GET request to the endpoint")
    public void iSendAGETRequestToTheEndpoint() {
        response = api.getListUser();


    }

    @Then("I should receive a {int} status code")
    public void iShouldReceiveAStatusCode(int statusCode) {

        Assert.assertEquals(statusCode, response.getStatusCode());
    }
}
