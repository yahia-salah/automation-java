package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPayment extends BasePage {
    By payByCheck = By.xpath("//span[.='Pay by Check']");
    By payByWire = By.xpath("//span[.='Pay by bank wire']");
    By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public OrderFormPayment() throws IOException {
    }

    public WebElement getPayByCheckRadioBtn() throws Exception {
        return getDriver().findElement(payByCheck);
    }
    public WebElement getPayByWireRadioBtn() throws Exception {
        return getDriver().findElement(payByWire);
    }
    public WebElement getTermsConditionsCheckbox() throws Exception {
        return getDriver().findElement(termsAndConditions);
    }
    public WebElement getOrderBtn() throws Exception {
        return getDriver().findElement(orderBtn);
    }
}
