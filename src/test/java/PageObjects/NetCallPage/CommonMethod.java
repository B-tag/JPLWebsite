package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Hooks.driver;

public class CommonMethod extends BasePage {

    public void assertPage(String text, int index) throws InterruptedException {

        if (text=="Confirmation") text="Done!";
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[" + index + "]")));
        WebElement element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[" + index + "]"));

        String backColour = element.getCssValue("border-color");
        String hexColor = Color.fromString(backColour).asHex();
        String title = element.getText();

        Assert.assertEquals(title, text);
        Assert.assertEquals(hexColor, "#4376b5");
    }

    public int indexFinder(String text) {
        int index = 0;

        switch (text) {
            case "Application":
                index = 1;
                break;
            case "Personal":
                index = 2;
                break;
            case "Address":
                index = 3;
                break;
            case "Finance":
                index = 4;
                break;
            case "Review":
                index = 5;
                break;
            case "Confirmation":
                index = 6;
                break;
        }
        return index;
    }

    public void pressNext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement nextElement = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nextElement.click();
    }

}
