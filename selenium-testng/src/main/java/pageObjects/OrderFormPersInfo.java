package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersInfo extends BasePage {
    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("form#customer-form > section input[name='email']");
    By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersInfo() throws IOException {
    }

    public WebElement getGenderMr() throws Exception {
        return getDriver().findElement(genderMr);
    }
    public WebElement getGenderMrs() throws Exception {
        return getDriver().findElement(genderMrs);
    }
    public WebElement getFirstNameField() throws Exception {
        return getDriver().findElement(firstNameField);
    }
    public WebElement getLastnameField() throws Exception {
        return getDriver().findElement(lastNameField);
    }
    public WebElement getEmailField() throws Exception {
        return getDriver().findElement(emailField);
    }
    public WebElement getPasswordField() throws Exception {
        return getDriver().findElement(passwordField);
    }
    public WebElement getBirthDateField() throws Exception {
        return getDriver().findElement(birthDateField);
    }
    public WebElement getRecOfferCheckbox() throws Exception {
        return getDriver().findElement(receiveOffersCheckbox);
    }
    public WebElement getNewsletterCheckbox() throws Exception {
        return getDriver().findElement(newsletterCheckbox);
    }
    public WebElement getTermsConditionsCheckbox() throws Exception {
        return getDriver().findElement(termsConditionsCheckbox);
    }
    public WebElement getContinueBtn() throws Exception {
        return getDriver().findElement(continueBtn);
    }
}
