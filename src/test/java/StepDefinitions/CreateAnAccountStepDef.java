package StepDefinitions;

import PageFunctions.BasePage;
import PageObjects.CreateAnAccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CreateAnAccountStepDef extends BasePage {
    
    CreateAnAccountPage createAnAccountPage=new CreateAnAccountPage();
    
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
}
