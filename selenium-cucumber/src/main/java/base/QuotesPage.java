package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class QuotesPage extends BasePage {
    By quoteStripName= By.cssSelector("span.QuoteStrip-name");
    By quoteStripSymbolAndExchange=By.cssSelector("span.QuoteStrip-symbolAndExchange");

    public QuotesPage() throws IOException {
    }

    public WebElement getQuoteStripName() throws Exception {
        return this.getDriver().findElement(quoteStripName);
    }

    public WebElement getQuoteStripSymbolAndExchange() throws Exception {
        return this.getDriver().findElement(quoteStripSymbolAndExchange);
    }
}
