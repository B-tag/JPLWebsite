package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class FinancePage extends BasePage {
    public void enterDetails(DataTable table) {
        List<Map<String,String>> map=table.asMaps();

        String BankName = map.get(0).get("BankName");
        String SortCode = map.get(0).get("SortCode");
        String AccountNumber = map.get(0).get("AccountNumber");

        WebElement add1 = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        WebElement town = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        WebElement add2 = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));

        add1.sendKeys(BankName);
        add2.sendKeys(SortCode);
        town.sendKeys(AccountNumber);

    }
}
