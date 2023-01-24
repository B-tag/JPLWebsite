package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class ApplicationPage extends BasePage {

    public void enteringLoanDetails(DataTable table) {

        List<Map<String, String>> map = table.asMaps();
        String amount = map.get(0).get("Amount");
        String term = map.get(0).get("Term");
        String reason = map.get(0).get("Reason");

        WebElement reasonElement = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        WebElement amountElement = driver.findElement(By.cssSelector("#slider_value_PCF0002141BDEFF3"));
        WebElement termElement = driver.findElement(By.cssSelector("#slider_value_PCF0002142BDEFF3"));

        amountElement.sendKeys(amount);
        termElement.sendKeys(term);

        Select reasonSelect = new Select(reasonElement);
        reasonSelect.selectByVisibleText(reason);
    }

    public void assertApplicationPage() throws InterruptedException {
        Thread.sleep(2000);
        WebElement pageTitle = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));

        String backColour = pageTitle.getCssValue("border-color");
        String hexColor = Color.fromString(backColour).asHex();
        String title = pageTitle.getText();

        Assert.assertEquals("Application", title);
//        Assert.assertEquals("#4376b5", hexColor);
    }
}
