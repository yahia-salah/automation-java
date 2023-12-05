package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage extends BasePage {
    By toggle = By.cssSelector(".toggle");
    By homeLink = By.linkText("HOMEPAGE");
    By accordionLink = By.linkText("ACCORDION");
    By browserTabLink = By.linkText("BROWSER TABS");
    By buttonsLink = By.linkText("BUTTONS");
    By calcLink = By.linkText("CALCULATOR (JS)");
    By contactUsLink = By.linkText("CONTACT US FORM TEST");
    By datePickerLink = By.linkText("DATE PICKER");
    By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    By fileUpload = By.linkText("FILE UPLOAD");
    By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    By iFrameLink = By.linkText("IFRAME");
    By loaderLink = By.linkText("LOADER");
    By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    By mouseLink = By.linkText("MOUSE MOVEMENT");
    By popupLink = By.linkText("POP UPS & ALERTS");
    By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    By tablesLink = By.linkText("TABLES");
    By testStoreLink = By.linkText("TEST STORE");
    By aboutMeLink = By.linkText("ABOUT ME");
    By cookie = By.cssSelector(".close-cookie-warning > span");

    public HomePage() throws IOException {
    }

    public WebElement getToggle() throws Exception {
        return getDriver().findElement(toggle);
    }
    public WebElement getHomepageLink() throws Exception {
        return getDriver().findElement(homeLink);
    }
    public WebElement getAccordionLink() throws Exception {
        return getDriver().findElement(accordionLink);
    }
    public WebElement getBrowserTabLink() throws Exception {
        return getDriver().findElement(browserTabLink);
    }
    public WebElement getButtonLink() throws Exception {
        return getDriver().findElement(buttonsLink);
    }
    public WebElement getCalcLink() throws Exception {
        return getDriver().findElement(calcLink);
    }
    public WebElement getContactUsLink() throws Exception {
        return getDriver().findElement(contactUsLink);
    }
    public WebElement getDatePickerLink() throws Exception {
        return getDriver().findElement(datePickerLink);
    }
    public WebElement getDropdownLink() throws Exception {
        return getDriver().findElement(dropdownLink);
    }
    public WebElement getFileUploadLink() throws Exception {
        return getDriver().findElement(fileUpload);
    }
    public WebElement getHiddenElementsLink() throws Exception {
        return getDriver().findElement(hiddenElementsLink);
    }
    public WebElement getIframeLink() throws Exception {
        return getDriver().findElement(iFrameLink);
    }
    public WebElement getLoaderLink() throws Exception {
        return getDriver().findElement(loaderLink);
    }
    public WebElement getLoginPortalLink() throws Exception {
        return getDriver().findElement(loginPortalLink);
    }
    public WebElement getMouseLink() throws Exception {
        return getDriver().findElement(mouseLink);
    }
    public WebElement getPopupLink() throws Exception {
        return getDriver().findElement(popupLink);
    }
    public WebElement getPredictiveLink() throws Exception {
        return getDriver().findElement(predictiveLink);
    }
    public WebElement getTablesLink() throws Exception {
        return getDriver().findElement(tablesLink);
    }
    public WebElement getTestStoreLink() throws Exception {
        return getDriver().findElement(testStoreLink);
    }
    public WebElement getAboutMeLink() throws Exception {
        return getDriver().findElement(aboutMeLink);
    }
    public WebElement getCookie() throws Exception {
        return getDriver().findElement(cookie);
    }
}
