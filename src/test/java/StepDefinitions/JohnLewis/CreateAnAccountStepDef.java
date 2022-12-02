package StepDefinitions.JohnLewis;

import PageFunctions.BasePage;
import PageObjects.JohnLewis.CreateAnAccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class CreateAnAccountStepDef extends BasePage {

    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();

    @And("I should see the {string} page")
    public void iShouldSeeTheCreateAnAccountPage(String value) {
        createAnAccountPage.assertCreateAccountPage(value);
    }

    @And("I enter my email and password")
    public void iEnterMyEmailAndPassword(DataTable dataTable) throws IOException {
        createAnAccountPage.enteringEmailPass(dataTable);
        takeScreenShot();
    }

    @And("I select subscribe option")
    public void iSelectSubscribeOption(DataTable dataTable) throws IOException {
        createAnAccountPage.selectSubscribeOptions(dataTable);
        takeScreenShot();
    }

    @And("I click on create account button")
    public void iClickOnCreateAccountButton() throws IOException {
        createAnAccountPage.clickOnCreateAccount();
        takeScreenShot();
    }

    @And("I enter my details")
    public void iEnterMyDetails(DataTable table) throws IOException {
        createAnAccountPage.enteringDetails(table);
        takeScreenShot();
    }

    @And("I accept to join john lewis")
    public void iAcceptToJoinJohnLewis() throws IOException {
        createAnAccountPage.clickAcceptBtn();
        takeScreenShot();
    }

    @When("I click on join for free")
    public void iClickOnJoinForFree() throws IOException {
        createAnAccountPage.clickJoinForFree();
        takeScreenShot();
    }

    @Then("I should see the registration complete")
    public void iShouldSeeTheRegistrationComplete() {
        createAnAccountPage.assertRegistrationComplete();
    }

    @And("I see the Join my john lewis message")
    public void iSeeTheJoinMyJohnLewisMessage() {
        createAnAccountPage.joinTitleAssertion();
    }
}
