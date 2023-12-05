package uk.co.automationtesting;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends Hooks {
    public OrderCompleteTest() throws IOException {
        super();
    }

    @Test
    public void endToEndTest() throws Exception {
        var home = new HomePage();
        var shopHome = new ShopHomePage();
        var shopProd=new ShopProductPage();
        var cPanel=new ShopContentPanel();
        var cart=new ShoppingCart();
        var pInfo=new OrderFormPersInfo();
        var orderDelivery=new OrderFormDelivery();
        var shipMethod = new OrderFormShippingMethod();
        var payment=new OrderFormPayment();

        home.getCookie().click();
        home.getTestStoreLink().click();
        ExtentManager.pass("Reached store page");
        shopHome.getProdOne().click();
        ExtentManager.pass("Reached product page");

        var size = new Select(shopProd.getSizeOption());
        size.selectByVisibleText("M");
        ExtentManager.pass("Selected size of product");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Added product to cart");
        cPanel.getCheckoutBtn().click();
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();
        ExtentManager.pass("Added Promo code");
        cart.getProceedCheckoutBtn().click();

        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("John");
        pInfo.getLastnameField().sendKeys("Smith");
        pInfo.getEmailField().sendKeys("johnsmit@test.com");
        //pInfo.getTermsConditionsCheckbox().click();
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()",pInfo.getTermsConditionsCheckbox());
        pInfo.getContinueBtn().click();
        ExtentManager.pass("Entered personal info");

        orderDelivery.getAddressField().sendKeys("123 Main Street");
        orderDelivery.getCityField().sendKeys("Houston");
        var state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        ExtentManager.pass("Entered delivery address");
        orderDelivery.getContinueBtn().click();

        shipMethod.getDeliveryMsgTextbox().sendKeys("Please leave my delivery on my porch, if I am not home.");
        shipMethod.getContinueBtn().click();

        payment.getPayByCheckRadioBtn().click();
        payment.getTermsConditionsCheckbox().click();
        payment.getOrderBtn().click();
        ExtentManager.pass("Placed order");

        Thread.sleep(1000);
    }
}
