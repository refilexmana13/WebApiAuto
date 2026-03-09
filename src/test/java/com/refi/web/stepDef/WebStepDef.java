package com.refi.web.stepDef;

import com.refi.web.base.BaseWeb;
import com.refi.web.pages.CheckOut;
import com.refi.web.pages.Inventory;
import com.refi.web.pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class WebStepDef extends BaseWeb {
    protected LoginPage loginPage;
    protected CheckOut checkOut = new CheckOut();
    protected Inventory inventory = new Inventory();

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
        String currentUrl;
        currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals("https://www.saucedemo.com/inventory.html") : "Expected URL: https://www.saucedemo.com/inventory.html, but got: " + currentUrl;

    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        assert actualErrorMessage.equals(errorMessage) : "Expected error message: " + errorMessage + ", but got: " + actualErrorMessage;
    }

    @Given("I have logged in")
    public void iHaveLoggedIn() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();

    }

    @When("I am on inventory page")
    public void iAmOnInventoryPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

    @And("I click add to cart")
    public void iClickAddToCart() {
        checkOut.clickAddCart();
    }

    @And("I open cart page")
    public void iOpenCartPage() {
        checkOut.clickCartLink();
    }

    @Then("cart should have {int} item")
    public void cartShouldHaveItem(int listItem) {
        int actualList = checkOut.inMyCart();
        Assert.assertEquals(listItem, actualList);
    }

    @And("I see product named {string}")
    public void iSeeProductNamed(String productName) {
        if (productName.equals("Sauce Labs Bike Light")) {
            checkOut.chooseProduct();
        }
        String actualText = checkOut.chooseProduct();
        Assert.assertEquals(productName, actualText);
    }

    @And("I click check out button")
    public void iClickCheckOutButton() {
        checkOut.clickCheckOut();
    }

    @And("I fill check out data with {string} , {string}, and {string}")
    public void iFillCheckOutDataWithAnd(String firstName, String lastName, String ZipCode) {
        checkOut.checkOutData(firstName, lastName, ZipCode);
        checkOut.clickContinue();
    }

    @And("I click finish")
    public void iClickFinish() {
        checkOut.clickFinish();
    }

    @Then("I should see {string}")
    public void iShouldSee(String thankYou) {
        String actual = checkOut.orderComplete();
        assert actual.equals(thankYou);
    }

    @And("I should see list item is displayed")
    public void iShouldSeeListItemIsDisplayed() {

    }

    @And("I add Backpack to cart")
    public void iAddBackpackToCart() {
       inventory.buttonAddToCart();
    }

    @And("I click remove")
    public void iClickRemove() {
        inventory.buttonRemoveFromCart();
    }

    @And("I click continue shopping")
    public void iClickContinueShopping() {
        inventory.continueShopping();
    }
}
