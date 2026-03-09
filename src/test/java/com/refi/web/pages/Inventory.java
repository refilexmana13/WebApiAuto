package com.refi.web.pages;

import com.refi.web.base.BasePage;
import org.openqa.selenium.By;

public class Inventory extends BasePage {


    private final By inventoryList = By.xpath("//div[@data-test=\"inventory-list\"]");
    private final By addBackpackToCart = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartLink = By.xpath("//a[@data-test='shopping-cart-link']");
    private final By buttonRemove = By.id("remove-sauce-labs-backpack");
    private final By buttonContinueShop = By.id("continue-shopping");

    public Inventory(){
        super();
    }

    public void inventoryPage(){
        getItemList(inventoryList);
    }

    public void buttonAddToCart(){
        click(addBackpackToCart);
    }

    public void clickCart(){
        click(cartLink);
    }

    public void buttonRemoveFromCart(){
        click(buttonRemove);
    }

    public void continueShopping(){
        click(buttonContinueShop);
    }
}
