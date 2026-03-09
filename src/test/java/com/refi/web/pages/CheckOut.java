package com.refi.web.pages;

import com.refi.web.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CheckOut extends BasePage {

    private final By productName = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    private final By addToCart = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    private final By cartLink = By.xpath("//a[@data-test='shopping-cart-link']");
    private final By myCart = By.className("cart_item_label");
    private final By checkOutButton = By.id("checkout");
    private final By inputFirstName = By.id("first-name");
    private final By inputLastName = By.id("last-name");
    private final By inputZipCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    private final By finishButton = By.id("finish");
    private final By thankYou = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public CheckOut() {
        super();
    }

    public String chooseProduct(){
        return getText(productName);
    }

    public void clickAddCart(){
        click(addToCart);
    }

    public void clickCartLink(){
        click(cartLink);
    }

    public int inMyCart(){
        return countElement(myCart);
    }

    public void clickCheckOut(){
        click(checkOutButton);
    }

    public void checkOutData(String firstName, String lastName, String zipCode){
       type(inputFirstName, firstName);
       type(inputLastName, lastName);
       type(inputZipCode, zipCode);
    }

    public void clickContinue(){
        click(continueButton);
    }

    public void clickFinish(){
        click(finishButton);
    }

    public String orderComplete(){
        wait.until(ExpectedConditions.urlContains("checkout-complete.html"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(thankYou));
        return getText(thankYou);
    }

}
