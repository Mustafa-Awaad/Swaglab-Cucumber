package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_checkoutPage {
    public WebElement firstName_locators(WebDriver driver){
        WebElement fname = driver.findElement(By.cssSelector("input[id=\"first-name\"]"));
        return fname;
    }

    public WebElement lastName_locators(WebDriver driver){
        WebElement lname = driver.findElement(By.cssSelector("input[id=\"last-name\"]"));
        return lname;
    }
    public WebElement postalCode_locators(WebDriver driver){
        WebElement code = driver.findElement(By.cssSelector("input[id=\"postal-code\"]"));
        return code;
    }
    public WebElement continueButton_locators(WebDriver driver){
        WebElement button = driver.findElement(By.cssSelector("input[id=\"continue\"]"));
        return button;
    }
    public WebElement checkoutTitle(WebDriver driver){
        WebElement title = driver.findElement(By.cssSelector("span[class=\"title\"]"));
        return title;
    }

}
