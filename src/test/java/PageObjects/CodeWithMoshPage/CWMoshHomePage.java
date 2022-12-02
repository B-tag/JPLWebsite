package PageObjects.CodeWithMoshPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class CWMoshHomePage extends BasePage {
    public void login(DataTable table) throws IOException {
        List<Map<String, String>> map = table.asMaps();

        driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[7]/a")).click();

        driver.findElement(By.id("email")).sendKeys(map.get(0).get("Username"));
        driver.findElement(By.id("password")).sendKeys(map.get(0).get("Password"));

        takeScreenShot();
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();
    }

    public void assertLoginSuccessfully() {
        String text = driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[7]/a/img")).getText();
    }
}
