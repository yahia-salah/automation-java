package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopProductPage extends BasePage {
    By sizeOption = By.cssSelector("[data-product-attribute='1']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage() throws IOException {
    }

    public WebElement getSizeOption() throws Exception {
        return getDriver().findElement(sizeOption);
    }
    public WebElement getQuantIncrease() throws Exception {
        return getDriver().findElement(quantityIncrease);
    }
    public WebElement getQuantDecrease() throws Exception {
        return getDriver().findElement(quantityDecrease);
    }
    public WebElement getAddToCartBtn() throws Exception {
        return getDriver().findElement(addToCartBtn);
    }
    public WebElement getHomepageLink() throws Exception {
        return getDriver().findElement(homepageLink);
    }
}
