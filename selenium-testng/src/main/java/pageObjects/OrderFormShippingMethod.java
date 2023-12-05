package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormShippingMethod extends BasePage {
    By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

    public OrderFormShippingMethod() throws IOException {
    }

    public WebElement getDeliveryMsgTextbox() throws Exception {
        return getDriver().findElement(deliveryMsgTextbox);
    }
    public WebElement getContinueBtn() throws Exception {
        return getDriver().findElement(continueBtn);
    }
}
