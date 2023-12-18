package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class WorldPage extends BasePage {
    By marketsBannerMenuItems=By.cssSelector("button.MarketsBannerMenu-marketOption");
    @FindBy(css = "span.MarketCard-symbol")
    List<WebElement>pfMarketCardSymbolItems;
    By marketCardSymbolItems=By.cssSelector("span.MarketCard-symbol");
    By searchToggleButton=By.cssSelector("button.SearchToggle-button");
    By searchEntrySearchFormInput=By.xpath("//form[@id='SearchEntry-searchForm']/input[@type='search']");
    By symbolResultItems = By.cssSelector("span.SymbolResultItem-symbol");

    public WorldPage() throws Exception {
        PageFactory.initElements(getDriver(),this);
    }

    public List<WebElement> getMarketsBannerMenuItems() throws Exception {
        return getDriver().findElements(marketsBannerMenuItems);
    }
    public List<WebElement> getMarketCardSymbolItems() throws Exception {
        //return getDriver().findElements(marketCardSymbolItems);
        return pfMarketCardSymbolItems;
    }
    public WebElement getSearchToggleButton() throws Exception {
        return getDriver().findElement(searchToggleButton);
    }
    public WebElement getSearchEntrySearchFormInput() throws Exception {
        return getDriver().findElement(searchEntrySearchFormInput);
    }
    public List<WebElement> getSymbolResultItems() throws Exception {
        return getDriver().findElements(symbolResultItems);
    }
}
