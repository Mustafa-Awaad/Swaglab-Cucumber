package org.example.TestCases;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.TestCases.Hooks.driver;


public class T02_purchaseProducts {
     P01_homePage loc1 = new P01_homePage();
     P02_productPage loc2 = new P02_productPage();
     P03_cartPage loc3 = new P03_cartPage();
     P04_checkoutPage loc4 = new P04_checkoutPage();
     P05_overviewPage loc5 = new P05_overviewPage();
     P06_finishPage loc6 = new P06_finishPage();

String firstName;
String lastName;
//Scenario 1
    @When("Enter valid username and valid password")
    public void loginSuccessfully(){
    loc1.userName_Locator(driver).sendKeys("standard_user");
    loc1.Password_Locator(driver).sendKeys("secret_sauce");
    loc1.loginButton_Locator(driver).click();
    }

    @Then("verify login successfully")
    public void loginVerification (){
        Assert.assertTrue(loc2.productSign_Locator(driver).getText().contains("Products"));
    }


//Scenario 2
    @And("add the most two products into cart")
    public void addProducts(){
        loc2.firstProduct_Locator(driver).click();
        loc2.secondProduct_Locator(driver).click();
    }
    @And("click on the cart")
    public void clickCart (){
        loc2.cartSign_Locator(driver).click();
    }
    @Then("Verify navigation to cart page and existence of selected products")
    public void cartPage_Verification (){

        Assert.assertTrue(loc3.cartTitle_locator(driver).getText().contains("Your Cart"));
        Assert.assertEquals(loc3.selectedProducts_locator(driver).size(),2);

    }

//Scenario 3
    @And("click on checkout button")
    public void navigateCheckoutPage (){
        loc3.checkoutButton_locator(driver).click();

    }
    @Then("verify navigation to checkout page")
    public void checkoutPage_Verification (){
        Assert.assertTrue(loc4.checkoutTitle(driver).getText().contains("Checkout"));
    }

//Sccenario 4

    @And("Enter first name,last name and postal code")
    public void enterInformation()  {

        loc4.firstName_locators(driver).sendKeys("Ahmed");
        loc4.lastName_locators(driver).sendKeys("Adel");
        loc4.postalCode_locators(driver).sendKeys("12344");
        loc4.continueButton_locators(driver).click();
    }
    @Then("verify navigation to overview page and amount of products are selected")
    public void overviewPage_Verification(){
        SoftAssert Verify = new SoftAssert();
        Assert.assertTrue(loc5.pageTitle(driver).getText().contains("Overview"));
        Assert.assertTrue(loc5.itemTotal_locator(driver).getText().contains("$79.98"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-two.html");
        Verify.assertAll();
    }

//Scenario 5
    @And("click on finish button")
    public void navigateToFinishPage (){
        loc5.finishButton_locator(driver).click();
    }
    @Then("verify finish the order")
    public void finishOrderVerification(){
        SoftAssert Verify = new SoftAssert();
        Assert.assertTrue(loc6.firstCompleteSign_locator(driver).getText().contains("Thank you"));
        Assert.assertTrue(loc6.secondCompleteSign_locator(driver).getText().contains("Your order has been dispatched"));
        Verify.assertAll();

    }
}
