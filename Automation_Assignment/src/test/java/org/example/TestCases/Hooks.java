package org.example.TestCases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before

    public void Open_browser() {

        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
    @After
    public void close_browser() {

        driver.quit();

    }

}
