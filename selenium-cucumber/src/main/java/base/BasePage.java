package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {
    private String url;
    private Properties prop;
    public static String screenshotDestinationPath;

    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");

        prop.load(data);
    }

    public WebDriver getDriver() throws Exception {
        return WebDriverInstance.getDriver();
    }

    public String getUrl() {
        url = prop.getProperty("url");
        return url;
    }

    public String takeSnapShot(String name) throws Exception {
        var srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        screenshotDestinationPath = System.getProperty("user.dir") + "\\test-output\\screenshots\\" + timeStamp() + ".png";
        var destFile = new File(screenshotDestinationPath);

        FileUtils.copyFile(srcFile, destFile);

        return name;
    }

    public byte[] takeSnapShot() throws Exception {
        var screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);

        return screenshot;
    }

    public static String getScreenshotDestinationPath(){
        return screenshotDestinationPath;
    }

    public String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public static void waitForElementInvisible(WebElement element, int timeout) {
        var wait = new WebDriverWait(WebDriverInstance.getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
