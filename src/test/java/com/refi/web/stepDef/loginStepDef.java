package com.refi.web.stepDef;

import com.refi.web.base.BaseTest;
import com.refi.web.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginStepDef extends BaseTest {
    protected LoginPage loginPage;
    String currentUrl;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username and password text with {string} and {string}")
    public void userInputUsernameAndPasswordTextWithAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user will be redirected to homepage")
    public void userWillBeRedirectedToHomepage() {
        currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals("https://www.saucedemo.com/inventory.html") : "Expected URL: https://www.saucedemo.com/inventory.html, but got: " + currentUrl;

    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        assert actualErrorMessage.equals(errorMessage) : "Expected error message: " + errorMessage + ", but got: " + actualErrorMessage;
    }
}
