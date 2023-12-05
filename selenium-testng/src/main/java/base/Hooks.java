package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Hooks extends BasePage {

    public Hooks() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws Exception {
        ExtentManager.log("Starting test...");
        getDriver().get(getUrl());
        ExtentManager.log("Initialized browser and navigated to the website");
    }

    @AfterTest
    public void tearDown(){
        ExtentManager.log("Stopping test...");
        WebDriverInstance.cleanupDriver();
        ExtentManager.log("Cleaned up driver");
    }
}
