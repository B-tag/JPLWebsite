package PageObjects.JohnLewis;

import PageFunctions.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefinitions.Hooks.driver;

public class LoginPage extends BasePage {


    public static void assertLoginPage() {
        String title = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/h1")).getText();
        Assert.assertEquals(title,"Sign in");
    }

    public void clickCreateAccount() {
        driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[2]/button")).click();
    }
}
