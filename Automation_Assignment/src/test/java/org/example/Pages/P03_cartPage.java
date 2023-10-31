package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_cartPage {
    public List<WebElement> selectedProducts_locator(WebDriver driver){
        List<WebElement> products = driver.findElements(By.cssSelector("div[class=\"cart_item\"]"));
        return products;
    }

    public WebElement checkoutButton_locator(WebDriver driver){
        WebElement button = driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
        return button;
    }

    public WebElement cartTitle_locator(WebDriver driver){
        WebElement title = driver.findElement(By.cssSelector("span[class=\"title\"]"));
        return title;
    }


}
