package PageObjects;

import PageFunctions.BasePage;
import org.openqa.selenium.By;

import static StepDefinitions.Hooks.driver;


public class JohnLewisHomePage extends BasePage {

    public void acceptCookies() {
        driver.findElement(By.xpath("//*[@id='pecr-cookie-banner-wrapper']/div/div[1]/div/div[2]/button[1]")).click();
    }

    public void signIn() {
        driver.findElement(By.xpath("//*[@id='root']/div/header/div/div/div/div[2]/nav/ul/li[1]/div/div/a")).click();
    }
}
