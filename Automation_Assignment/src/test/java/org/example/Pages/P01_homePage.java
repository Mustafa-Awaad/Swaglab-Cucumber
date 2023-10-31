package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_homePage {
    public WebElement userName_Locator(WebDriver driver){
        WebElement userName = driver.findElement(By.cssSelector("input[id=\"user-name\"]"));
        return userName;
    }

    public WebElement Password_Locator(WebDriver driver){
        WebElement password = driver.findElement(By.cssSelector("input[id=\"password\"]"));
        return password;
    }
    public WebElement loginButton_Locator(WebDriver driver){
        WebElement button = driver.findElement(By.cssSelector("input[id=\"login-button\"]"));
        return button;
    }

    public WebElement errorMessage_Locator(WebDriver driver){
        WebElement message = driver.findElement(By.cssSelector("div[class=\"error-message-container error\"]"));
        return message;
    }

}
