package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_overviewPage {
    public WebElement itemTotal_locator(WebDriver driver){
        WebElement price = driver.findElement(By.cssSelector("div[class=\"summary_subtotal_label\"]"));
        return price;
    }

    public WebElement finishButton_locator(WebDriver driver){
        WebElement button = driver.findElement(By.cssSelector("button[id=\"finish\"]"));
        return button;
    }

    public WebElement pageTitle(WebDriver driver){
        WebElement title = driver.findElement(By.cssSelector("span[class=\"title\"]"));
        return title;
    }

}
