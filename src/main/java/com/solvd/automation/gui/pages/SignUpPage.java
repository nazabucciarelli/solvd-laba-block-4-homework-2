package com.solvd.automation.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(id = "email")
    private ExtendedWebElement emailInput;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "login")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//button[@data-continue-to = 'password-container']")
    private ExtendedWebElement emailContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'username-container']")
    private ExtendedWebElement passwordContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'opt-in-container']")
    private ExtendedWebElement usernameContinueButton;

    @FindBy(xpath = "//button[@data-continue-to = 'captcha-and-submit-container']")
    private ExtendedWebElement emailPreferencesContinueButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getEmailInput() {
        return emailInput;
    }


    public ExtendedWebElement getPasswordInput() {
        return passwordInput;
    }


    public ExtendedWebElement getUsernameInput() {
        return usernameInput;
    }

    public ExtendedWebElement getEmailContinueButton() {
        return emailContinueButton;
    }

    public ExtendedWebElement getPasswordContinueButton() {
        return passwordContinueButton;
    }

    public ExtendedWebElement getUsernameContinueButton() {
        return usernameContinueButton;
    }

    public ExtendedWebElement getEmailPreferencesContinueButton() {
        return emailPreferencesContinueButton;
    }

    public void clickEmailContinueButton() {
        emailContinueButton.click();
    }

    public void clickPasswordContinueButton() {
        passwordContinueButton.click();
    }

    public void clickUsernameContinueButton() {
        usernameContinueButton.click();
    }

    public void clickEmailPreferencesContinueButton() {
        emailPreferencesContinueButton.click();
    }

    public void typeEmailInput(String text) {
        emailInput.type(text);
    }

    public void typePasswordInput(String text) {
        passwordInput.type(text);
    }

    public void typeUsernameInput(String text) {
        usernameInput.type(text);
    }

    public boolean isEmailInputPresent() {
        return emailInput.isPresent();
    }

    public boolean isUsernameInputPresent() {
        return usernameInput.isPresent();
    }

    public boolean isPasswordInputPresent() {
        return passwordInput.isPresent();
    }

    public boolean isEmailContinueButtonPresent() {
        return emailContinueButton.isPresent();
    }

    public boolean isUsernameContinueButtonPresent() {
        return usernameContinueButton.isPresent();
    }

    public boolean isPasswordContinueButtonPresent() {
        return passwordContinueButton.isPresent();
    }

    public boolean isEmailPreferencesContinueButtonPresent() {
        return emailPreferencesContinueButton.isPresent();
    }
}
