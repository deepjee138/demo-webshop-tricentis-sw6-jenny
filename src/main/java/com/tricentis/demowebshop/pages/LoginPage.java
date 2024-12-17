package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jenny
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    WebElement errorMessage;

    /**
     * This method will welcome text
     */

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Get welcomeText : " + welcomeText.getText());
        return message;
    }

    /**
     * This method will enter email
      */
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailId '" + email + "' to email field : "
                + emailField.getText());
    }

    /**
     * This method will enter password
     * @param password
     */

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password '" + password + "' to password field : "
                + passwordField.getText());
    }

    /**
     * This method will click on login button
     */

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on loginButton");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Get errorMessage : " + errorMessage.getText());
        return message;
    }
}
