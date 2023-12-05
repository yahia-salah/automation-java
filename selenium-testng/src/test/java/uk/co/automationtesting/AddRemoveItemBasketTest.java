package uk.co.automationtesting;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)
public class AddRemoveItemBasketTest extends Hooks {
    public AddRemoveItemBasketTest() throws IOException {
        super();
    }

    @Test
    public void addRemoveItem() throws Exception {
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
        ExtentManager.pass("Selected product size");
        shopProd.getQuantIncrease().click();
        ExtentManager.pass("Increased quantity");
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Added product to cart");
        cPanel.getContinueShopBtn().click();

        shopProd.getHomepageLink().click();
        shopHome.getProdTwo().click();
        size = new Select(shopProd.getSizeOption());
        size.selectByVisibleText("S");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();
        cPanel.getCheckoutBtn().click();

        cart.getDeleteItemTwo().click();
        waitForElementInvisible(cart.getDeleteItemTwo(),10);

        var totalAmount = cart.getTotalAmount().getText();
        System.out.println("Total Amount: "+totalAmount);

        Assert.assertEquals(totalAmount,"$45.23","Invalid Total Amount");
        ExtentManager.pass("Total amount is correct");
    }
}
