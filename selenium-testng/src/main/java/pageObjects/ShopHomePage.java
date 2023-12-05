package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopHomePage extends BasePage {
    By productOne = By.linkText("Hummingbird Printed T-Shirt");
    By productTwo = By.linkText("Hummingbird Printed Sweater");
    By productThree = By.linkText("The Best Is Yet To Come'...");
    By productFour = By.linkText("The Adventure Begins Framed...");
    By productFive = By.linkText("Today Is A Good Day Framed...");
    By productSix = By.linkText("Mug The Best Is Yet To Come");
    By productSeven = By.linkText("Mug The Adventure Begins");
    By productEight = By.linkText("Mug Today Is A Good Day");

    public ShopHomePage() throws IOException {
    }

    public WebElement getProdOne() throws Exception {
        return getDriver().findElement(productOne);
    }
    public WebElement getProdTwo() throws Exception {
        return getDriver().findElement(productTwo);
    }
    public WebElement getProdThree() throws Exception {
        return getDriver().findElement(productThree);
    }
    public WebElement getProdFour() throws Exception {
        return getDriver().findElement(productFour);
    }
    public WebElement getProdFive() throws Exception {
        return getDriver().findElement(productFive);
    }
    public WebElement getProdSix() throws Exception {
        return getDriver().findElement(productSix);
    }
    public WebElement getProdSeven() throws Exception {
        return getDriver().findElement(productSeven);
    }
    public WebElement getProdEight() throws Exception {
        return getDriver().findElement(productEight);
    }
}
