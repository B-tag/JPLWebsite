package StepDefinitions.CodeWithMoshStepDef;

import PageFunctions.BasePage;
import PageObjects.CodeWithMoshPage.CWMoshHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class CWMoshHomePageStepDef extends BasePage {

    CWMoshHomePage cwMoshHomePage = new CWMoshHomePage();

    @And("login to my account")
    public void loginToMyAccount(DataTable table) throws IOException {
        cwMoshHomePage.login(table);
        takeScreenShot();
    }

    @When("I click on {string}")
    public void iClickOnCourses() {

    }

    @And("I logged in to my account successfully")
    public void iLoggedInToMyAccountSuccessfully() {
        cwMoshHomePage.assertLoginSuccessfully();
    }
}
