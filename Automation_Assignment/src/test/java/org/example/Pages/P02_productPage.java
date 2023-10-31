package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_productPage {
    public WebElement productSign_Locator(WebDriver driver){
        WebElement sign = driver.findElement(By.cssSelector("span[class=\"title\"]"));
        return sign;
    }

    public WebElement firstProduct_Locator(WebDriver driver){
        WebElement fProduct = driver.findElement(By.cssSelector("button[id=\"add-to-cart-sauce-labs-backpack\"]"));
        return fProduct;
    }
    public WebElement secondProduct_Locator(WebDriver driver){
        WebElement sProduct = driver.findElement(By.cssSelector("button[id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        return sProduct;
    }
    public WebElement cartSign_Locator(WebDriver driver){
        WebElement cart = driver.findElement(By.cssSelector("a[class=\"shopping_cart_link\"]"));
        return cart;
    }
}
