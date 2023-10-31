package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06_finishPage {
    public WebElement firstCompleteSign_locator(WebDriver driver){
        WebElement fsign = driver.findElement(By.cssSelector("h2[class=\"complete-header\"]"));
        return fsign;
    }

    public WebElement secondCompleteSign_locator(WebDriver driver){
        WebElement secondSign = driver.findElement(By.cssSelector("div[class=\"complete-text\"]"));
        return secondSign;
    }

}
