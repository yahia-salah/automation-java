package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class WorldPage extends BasePage{
    By marketsBannerMenuItems=By.cssSelector("button.MarketsBannerMenu-marketOption");
    By marketCardSymbolItems=By.cssSelector("span.MarketCard-symbol");
    By searchToggleButton=By.cssSelector("button.SearchToggle-button");
    By searchEntrySearchFormInput=By.xpath("//form[@id='SearchEntry-searchForm']/input[@type='search']");
    By symbolResultItems = By.cssSelector("span.SymbolResultItem-symbol");

    public WorldPage() throws IOException {
    }

    public List<WebElement> getMarketsBannerMenuItems() throws Exception {
        return getDriver().findElements(marketsBannerMenuItems);
    }
    public List<WebElement> getMarketCardSymbolItems() throws Exception {
        return getDriver().findElements(marketCardSymbolItems);
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
