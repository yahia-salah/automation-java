package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormDelivery extends BasePage {
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By companyNameField = By.cssSelector("input[name='company']");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By postcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");

    public OrderFormDelivery() throws IOException {
    }

    public WebElement getFirstNameField() throws Exception {
        return getDriver().findElement(firstNameField);
    }
    public WebElement getLastnameField() throws Exception {
        return getDriver().findElement(lastNameField);
    }
    public WebElement getCompanyField() throws Exception {
        return getDriver().findElement(companyNameField);
    }
    public WebElement getAddressField() throws Exception {
        return getDriver().findElement(addressField);
    }
    public WebElement getAddressCompField() throws Exception {
        return getDriver().findElement(addressComplementField);
    }
    public WebElement getCityField() throws Exception {
        return getDriver().findElement(cityField);
    }
    public WebElement getStateDropdown() throws Exception {
        return getDriver().findElement(stateDropdown);
    }
    public WebElement getPostcodeField() throws Exception {
        return getDriver().findElement(postcodeField);
    }
    public WebElement getCountryDropdown() throws Exception {
        return getDriver().findElement(countryDropdown);
    }
    public WebElement getPhoneField() throws Exception {
        return getDriver().findElement(phoneField);
    }
    public WebElement getInvoiceSameAddCheckbox() throws Exception {
        return getDriver().findElement(invoiceSameAddCheckboc);
    }
    public WebElement getContinueBtn() throws Exception {
        return getDriver().findElement(continueBtn);
    }
}
