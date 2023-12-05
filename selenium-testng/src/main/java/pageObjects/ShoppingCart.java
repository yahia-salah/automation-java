package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingCart extends BasePage {
    By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    By promoTextbox = By.cssSelector("input[name='discount_name']");
    By promoAddBtn = By.cssSelector("form[method='post']  span");
    By proceedToCheckoutBtn = By.cssSelector(".cart-detailed-actions .btn-primary");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart() throws IOException {
    }

    public WebElement getHavePromo() throws Exception {
        return getDriver().findElement(havePromo);
    }
    public WebElement getPromoTextbox() throws Exception {
        return getDriver().findElement(promoTextbox);
    }
    public WebElement getPromoAddBtn() throws Exception {
        return getDriver().findElement(promoAddBtn);
    }
    public WebElement getProceedCheckoutBtn() throws Exception {
        return getDriver().findElement(proceedToCheckoutBtn);
    }
    public WebElement getDeleteItemOne() throws Exception {
        return getDriver().findElement(deleteItemOne);
    }
    public WebElement getDeleteItemTwo() throws Exception {
        return getDriver().findElement(deleteItemTwo);
    }
    public WebElement getTotalAmount() throws Exception {
        return getDriver().findElement(totalValue);
    }
}
