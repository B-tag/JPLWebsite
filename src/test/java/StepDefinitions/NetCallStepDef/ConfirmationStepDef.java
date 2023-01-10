package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.ConfirmationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ConfirmationStepDef extends BasePage {

    ConfirmationPage confirmationPage=new ConfirmationPage();

    @And("I click on new application")
    public void clickOnNewApplicationPage() throws IOException {
        confirmationPage.clickOnNewApplication();
        takeScreenShot();
    }

    @Then("I am in the Confirmation page")
    public void iAmInTheConfirmationPage() throws IOException, InterruptedException {
        takeScreenShot();
        confirmationPage.asserConfirmationPage();
    }
}
