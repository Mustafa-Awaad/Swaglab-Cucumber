package org.example.TestCases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_homePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.TestCases.Hooks.driver;

public class T01_invalidLogin {

    P01_homePage loc1 = new P01_homePage();


    //Scenario 1
    @When("Enter valid user name and invalid password")
    public void enterInvalidPassword(){
        loc1.userName_Locator(driver).sendKeys("standard_user");
        loc1.Password_Locator(driver).sendKeys("secret");
        loc1.loginButton_Locator(driver).click();

    }
    @Then("verify error message of invalid password")
    public void VerifyInvalidPassword(){
        String messageColor = loc1.errorMessage_Locator(driver).getCssValue("background-color");
        String message = Color.fromString(messageColor).asHex();

        SoftAssert verification = new SoftAssert();
        Assert.assertTrue(loc1.errorMessage_Locator(driver).getText().contains("do not match"));
        Assert.assertEquals(message,"#e2231a");
        verification.assertAll();
    }

    //Scenario 2
    @When("Enter invalid user name and valid password")
    public void enterInvalidUserName(){
        loc1.userName_Locator(driver).sendKeys("standard");
        loc1.Password_Locator(driver).sendKeys("secret_sauce");
        loc1.loginButton_Locator(driver).click();
    }
    @Then("verify error message of invalid username")
    public void VerifyInvalidUserName(){
        String messageColor = loc1.errorMessage_Locator(driver).getCssValue("background-color");
        String message = Color.fromString(messageColor).asHex();

        SoftAssert verification = new SoftAssert();
        Assert.assertTrue(loc1.errorMessage_Locator(driver).getText().contains("do not match"));
        Assert.assertEquals(message,"#e2231a");
        verification.assertAll();


    }
}
