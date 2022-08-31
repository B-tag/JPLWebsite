package PageFunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./tmp/" + scenario.getName() + "/" + dateFormat.format(date) + ".png"));

    }
}
