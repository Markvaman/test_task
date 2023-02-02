package PageObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    AgePage agePage;
    static Faker faker = new Faker();
    static String email = faker.internet().emailAddress();
    static String password = faker.internet().password(6, 10);
    private final By emailField = By.xpath("//input[@type='email']");
    private final By passwordField = By.xpath("//input[@type='password']");
    private final By enterButton = By.className("form_auth_button");

    public MainPage openPage() {
        open("http://u920152e.beget.tech/");
        return this;
    }

    public void setEmailField(){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(){
        driver.findElement(passwordField).sendKeys(password);
    }
    public AgePage clickOnEnterButton(){
        driver.findElement(enterButton).click();
        return agePage;
    }

    public void authorise(){
        setEmailField();
        setPasswordField();
    }
}
