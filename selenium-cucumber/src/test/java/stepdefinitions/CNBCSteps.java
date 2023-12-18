package stepdefinitions;

import base.BasePage;
import pageObjects.QuotesPage;
import pageObjects.WorldPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.util.stream.Collectors;

public class CNBCSteps extends BasePage {
    QuotesPage quotesPage;
    WorldPage worldPage;

    public CNBCSteps() throws Exception {
        quotesPage = new QuotesPage();
        worldPage = new WorldPage();
    }

    @Given("User navigates to CNBC website")
    public void userNavigatesToCNBCWebsite() throws Exception {
        getDriver().get(getUrl());
    }

    @Then("The current page should be {string}")
    public void theCurrentPageShouldBe(String pageTitle) throws Exception {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(pageTitle.toLowerCase()));
    }

    @Then("Markets banner menu items has the following")
    public void marketsBannerMenuItemsHasTheFollowing(DataTable dataTable) throws Exception {
        var names = dataTable.asMaps(String.class,String.class).stream().map(x->x.get("name")).collect(Collectors.toList());
        var actualNames = worldPage.getMarketsBannerMenuItems().stream().map(x->x.getText()).collect(Collectors.toList());

        Assert.assertTrue(actualNames.containsAll(names));
    }

    @When("User clicks markets banner menu item {string}")
    public void userClicksMarketsBannerMenuItem(String text) throws Exception {
        var item = worldPage.getMarketsBannerMenuItems().stream().filter(x->x.getText().equals(text)).findFirst().get();

        item.click();

        Thread.sleep(5000);
    }

    @Then("The market card symbols should have {int} items")
    public void theMarketCardSymbolsShouldHaveItems(int count) throws Exception {
        var items = worldPage.getMarketCardSymbolItems();

        Assert.assertEquals(items.size(),count);
    }

    @And("The market card symbols should contain text {string}")
    public void theMarketCardSymbolsShouldContainText(String text) throws Exception {
        var items = worldPage.getMarketCardSymbolItems().stream().map(x->x.getText()).collect(Collectors.toList());

        Assert.assertTrue(items.contains(text));
    }

    @When("User clicks Search quotes, news & videos button")
    public void userClicksSearchQuotesNewsVideosButton() throws Exception {
        worldPage.getSearchToggleButton().click();
    }

    @And("User types {string} in search quotes, news & videos textbox")
    public void userTypesInSearchQuotesNewsVideosTextbox(String text) throws Exception {
        worldPage.getSearchEntrySearchFormInput().clear();
        worldPage.getSearchEntrySearchFormInput().sendKeys(text);

        Thread.sleep(5000);
    }

    @Then("The suggested symbols should have {int} results")
    public void theSuggestedSymbolsShouldHaveResults(int count) throws Exception {
        var results = worldPage.getSymbolResultItems();

        Assert.assertEquals(results.size(),count);
    }

    @And("The suggested symbols should contain text {string}")
    public void theSuggestedSymbolsShouldContainText(String text) throws Exception {
        var results = worldPage.getSymbolResultItems().stream().map(x->x.getText()).collect(Collectors.toList());

        Assert.assertTrue(results.contains(text));
    }

    @When("User clicks the first result of the suggested symbols")
    public void userClicksTheFirstResultOfTheSuggestedSymbols() throws Exception {
        var results = worldPage.getSymbolResultItems();

        results.get(0).click();
    }

    @And("The quote name should be {string}")
    public void theQuoteNameShouldBe(String text) throws Exception {
        var actualText = quotesPage.getQuoteStripName().getText();

        Assert.assertEquals(actualText,text);
    }

    @And("The quote symbol and exchange should be {string}")
    public void theQuoteSymbolAndExchangeShouldBe(String text) throws Exception {
        var actualText = quotesPage.getQuoteStripSymbolAndExchange().getText();

        Assert.assertEquals(actualText,text);
    }
}
