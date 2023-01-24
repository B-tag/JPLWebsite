package PageObjects.NetCallPage;

import PageFunctions.BasePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class ReviewPage extends BasePage {


    public void clickNext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement reviewPageNext = driver.findElement(By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        reviewPageNext.click();
    }

    public void compareDetails(DataTable table) {

        WebElement Amount = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[4]/div/div"));
        WebElement Duration = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[5]/div/div"));
        WebElement Interest = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[6]/div/div"));
        WebElement Monthly_Payments = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[7]/div/div"));
        WebElement Reason = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[8]/div/div"));
        WebElement Forename = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[10]/div/div"));
        WebElement Surname = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[11]/div/div"));
        WebElement DOB = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[12]/div/div"));
        WebElement Email = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[13]/div/div"));
        WebElement PhoneNumber = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[14]/div/div"));
        WebElement AddressLine01 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[16]/div/div"));
        WebElement AddressLine02 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[17]/div/div"));
        WebElement Town = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[18]/div/div"));
        WebElement PostCode = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[19]/div/div"));
        WebElement BankName = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[21]/div/div"));
        WebElement SortCode = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[22]/div/div"));
        WebElement AccountNumber = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div/div[4]/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/div/div[23]/div/div"));

        List<Map<String, String>> map = table.transpose().asMaps();

        String amount = map.get(0).get("Amount");
        String term = map.get(0).get("Term");
        String reason = map.get(0).get("Reason");

        String forename = map.get(0).get("Forename");
        String surname = map.get(0).get("Surename");
        String dob = map.get(0).get("DOB");
        String email = map.get(0).get("email");
        String phoneNumber = map.get(0).get("PhoneNumber");

        String addressLine1 = map.get(0).get("AddressLine1");
        String addressLine2 = map.get(0).get("AddressLine2");
        String town_City = map.get(0).get("Town_City");
        String postCode = map.get(0).get("PostCode");

        String bankName = map.get(0).get("BankName");
        String sortCode = map.get(0).get("SortCode");
        String accountNumber = map.get(0).get("AccountNumber");


//        Assert.assertEquals(Amount.getText(), amount);
//        Assert.assertEquals(Duration.getText(), term);
//         Interest
//         Monthly payment
//        Assert.assertEquals(DOB.getText(), dob);
        Assert.assertEquals(reason, Reason.getText());
        Assert.assertEquals(forename, Forename.getText());
        Assert.assertEquals(surname, Surname.getText());
        Assert.assertEquals(email, Email.getText());
        Assert.assertEquals(phoneNumber, PhoneNumber.getText());
        Assert.assertEquals(addressLine1, AddressLine01.getText());
        Assert.assertEquals(addressLine2, AddressLine02.getText());
        Assert.assertEquals(town_City, Town.getText());
        Assert.assertEquals(postCode, PostCode.getText());
        Assert.assertEquals(bankName, BankName.getText());
        Assert.assertEquals(sortCode, SortCode.getText());
        Assert.assertEquals(accountNumber, AccountNumber.getText());

    }
}
