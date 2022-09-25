package PageFunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.scenario;

public class BasePage {

    public void navigate(String value) {
        driver.navigate().to(value);
    }

    public void takeScreenShot() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh-mm-ss.SSS");
        Date date = new Date();
        String filePath;

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        filePath = "./tmp/" + scenario.getName() + "/" + dateFormat.format(date) + ".png";
        FileUtils.copyFile(screenshot, new File(filePath));
    }

    public void waitForXpath(Duration value, String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, value);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
    }

}
