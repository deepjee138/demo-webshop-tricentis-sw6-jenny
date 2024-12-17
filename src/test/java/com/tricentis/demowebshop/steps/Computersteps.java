package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopPage;
import com.tricentis.demowebshop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Computersteps {

    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("Verify Computers text")
    public void verifyComputersText() {
        Assert.assertEquals(new ComputerPage().getComputerHeading(), "Computers");

    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("Verify Desktops text")
    public void verifyDesktopsText() {
        Assert.assertEquals(new DesktopPage().getDesktopHeading(), "Desktops");
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnCompLink();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);

    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddRadio(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectCheckBox(software);
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("Verify message {string}")
    public void verifyMessage(String text) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddToCartSuccessMsg(), text, "Success message not displayed");
    }
}

