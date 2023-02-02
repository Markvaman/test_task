import PageObject.AgePage;
import PageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static driver.driver.*;

public class MainPageTest {
    protected MainPage mainPage;
    @BeforeMethod
    public void start(){
        createDriver();
        mainPage = new MainPage();
        mainPage.openPage();
    }
    @AfterMethod
    public void finish(){
        quite();
    }

    @Test
    public void setValidDataToAuthoriseForm(){
        mainPage.authorise();
        mainPage.clickOnEnterButton();
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("form_auth_submit"));
        Assert.assertTrue(new AgePage().sendButtonIsVisible());
        System.out.println("\"________________________\\n\" +\n" +
                "                \"TEST PASSED: Authorisation is succeed");


    }
}
