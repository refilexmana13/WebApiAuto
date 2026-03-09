package com.refi.web.pages;

import com.refi.web.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final WebDriver driver;

    private final By inputTextUsername = By.cssSelector("input#user-name");
    private final By inputTextPassword = By.id("password");
    private final By buttonLogin = By.id("login-button");
    private final By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");


    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //method
    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");

    }

    public void login(String username, String password) {
       type(inputTextUsername,username);
       type(inputTextPassword,password);
    }

    public void clickLoginButton() {
        click(buttonLogin);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }
}

