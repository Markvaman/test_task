package PageObject;

import org.openqa.selenium.By;

public class AgePage extends BasePage {
    private final By sendButton = By.xpath("//input[@type='submit']");
    public Boolean sendButtonIsVisible(){
        return driver.findElement(sendButton).isDisplayed();
    }
}
