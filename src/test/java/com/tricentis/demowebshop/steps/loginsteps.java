package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginsteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in unsuccessfully")
    public void iShouldLogInSuccessfully() {
    }

    @Then("I should see LogOut Link is display")
    public void iShouldSeeLogOutLinkIsDisplay() {
       new HomePage().isLogOutLinkDisplay();
    }

    @And("I click On LogOutLink")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should see the login link is display")
    public void iShoudSeeTheLoginLinkIsDisplay() {
    }
}
