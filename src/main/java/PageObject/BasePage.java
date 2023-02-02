package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driver.driver.getDriver;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    protected void open(String url) {
        driver.get(url);
    }
}
