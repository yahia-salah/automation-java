package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {
    By continueShoppingBtn = By.xpath("//button[contains(text(), 'Continue')]");
    By checkoutBtn = By.cssSelector(".cart-content-btn .btn-primary");

    public ShopContentPanel() throws IOException {
    }

    public WebElement getContinueShopBtn() throws Exception {
        return getDriver().findElement(continueShoppingBtn);
    }
    public WebElement getCheckoutBtn() throws Exception {
        return getDriver().findElement(checkoutBtn);
    }
}
