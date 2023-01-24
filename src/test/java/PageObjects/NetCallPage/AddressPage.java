package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class AddressPage extends BasePage {

    public void enterDetails(DataTable table) {
        List<Map<String, String>> map = table.asMaps();

        String AddressLine1 = map.get(0).get("AddressLine1");
        String AddressLine2 = map.get(0).get("AddressLine2");
        String Town_City = map.get(0).get("Town_City");
        String PostCode = map.get(0).get("PostCode");

        WebElement add1 = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        WebElement town = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        WebElement add2 = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        WebElement postCode = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));

        add1.sendKeys(AddressLine1);
        add2.sendKeys(AddressLine2);
        town.sendKeys(Town_City);
        postCode.sendKeys(PostCode);
    }
}
