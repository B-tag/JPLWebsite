package PageObjects;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class CreateAnAccountPage extends BasePage {

    public void assertCreateAccountPage(String value) {
        String title = driver.findElement(By.xpath("//*[@id='main']/div/div[1]/h1")).getText();
        Assert.assertEquals(title, value);
    }

    public void enteringEmailPass(DataTable table) {
        List<Map<String, String>> map = table.asMaps();
        String email = map.get(0).get("email");
        String password = map.get(0).get("password");

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='passwordCreate']")).sendKeys(password);
    }

    public void selectSubscribeOptions(DataTable table) {
        List<Map<String, String>> map = table.asMaps();
        String subscribe = map.get(0).get("subscribe");
        String johnLewis = map.get(0).get("JohnLewis");
        String waitrose = map.get(0).get("Waitrose");
        String johnLewisFinancial = map.get(0).get("JohnLewisFinancial");

        if (subscribe.toLowerCase() == "no") {
            driver.findElement(By.id("marketingPreferencesNo")).click();
            if ((johnLewis.toLowerCase() == "yes"))
                driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[2]/div/form/fieldset/div/div[1]/label")).click();
            if ((waitrose.toLowerCase() == "yes"))
                driver.findElement(By.id("//*[@id='main']/div/div[2]/div[2]/div/form/fieldset/div/div[2]/label")).click();
            if ((johnLewisFinancial.toLowerCase() == "yes"))
                driver.findElement(By.id("//*[@id='main']/div/div[2]/div[2]/div/form/fieldset/div/div[3]/label")).click();

        } else driver.findElement(By.id("marketingPreferences-message")).click();
    }

    public void clickOnCreateAccount() {
        driver.findElement(By.id("registerForm")).click();
    }
}
