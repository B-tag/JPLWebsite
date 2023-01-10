package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.ApplicationPage;
import PageObjects.NetCallPage.CommonMethod;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ApplicationStepDef extends BasePage {

    ApplicationPage applicationPage = new ApplicationPage();
    CommonMethod commonMethod = new CommonMethod();

    @And("I would like to have a loan in below details")
    public void iWouldLikeToHaveALoanInBelowDetails(DataTable table) throws IOException {
        applicationPage.enteringLoanDetails(table);
        takeScreenShot();
    }

    @When("I press next")
    public void iPressNext() throws InterruptedException {
        commonMethod.pressNext();
    }

    @And("I am in the application page")
    public void iAmInTheApplicationPage() throws InterruptedException {
        applicationPage.assertApplicationPage();
    }
}
