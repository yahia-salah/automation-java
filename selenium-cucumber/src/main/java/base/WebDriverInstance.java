package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInstance {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            try {
                driver.set(createDriver());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws Exception {
        WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");

        prop.load(data);

        var headless = Boolean.parseBoolean(prop.getProperty("headless"));

        switch (prop.getProperty("browser").toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();

                var chromeOptions = new ChromeOptions();
                if (headless)
                    chromeOptions.addArguments("headless");

                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new Exception("Invalid Browser: " + prop.getProperty("browser"));
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    public static void cleanupDriver() {
        driver.get().quit();
        driver.remove();
    }
}
