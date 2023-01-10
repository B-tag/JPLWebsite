package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class PersonalPage extends BasePage {

    public void enterDetails(DataTable table) {

        List<Map<String, String>> map = table.asMaps();
        String forename = map.get(0).get("Forename");
        String surname = map.get(0).get("Surename");
        String DOB = map.get(0).get("DOB");
        String email = map.get(0).get("email");
        String phoneNumber = map.get(0).get("PhoneNumber");

        WebElement forename_element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        WebElement surname_element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        WebElement DOB_element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        WebElement email_element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));
        WebElement phoneNumber_element = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]"));

        forename_element.sendKeys(forename);
        surname_element.sendKeys(surname);
        DOB_element.sendKeys(DOB);
        email_element.sendKeys(email);
        phoneNumber_element.sendKeys(phoneNumber);

    }
}
