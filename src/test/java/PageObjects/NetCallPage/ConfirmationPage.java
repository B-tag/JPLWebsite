package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import static StepDefinitions.Hooks.driver;

public class ConfirmationPage extends BasePage {


    public void clickOnNewApplication() {
        driver.findElement(By.cssSelector("a[data-ts_interaction='link']")).click();
    }

    public void asserConfirmationPage() throws InterruptedException {

        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]"));
        String backColour = element.getCssValue("border-color");
        String hexColor = Color.fromString(backColour).asHex();
        String title = element.getText();

        Assert.assertEquals("Done!", title);
        Assert.assertEquals("#4376b5", hexColor);
    }
}
