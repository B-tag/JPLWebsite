package PageObjects;

import PageFunctions.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static StepDefinitions.Hooks.driver;

public class GoogleHomePage extends BasePage {

    public void searchFor(String text) throws IOException {
        takeScreenShot();
        driver.findElement(By.id("L2AGLb")).click();
        takeScreenShot();
        driver.findElement(By.xpath("//*/input[@name='q']")).sendKeys(text);
        takeScreenShot();
        driver.findElement(By.xpath("//*/input[@name='q']")).sendKeys(Keys.ENTER);
// /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input

    }


}
