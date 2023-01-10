package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.CommonMethod;
import PageObjects.NetCallPage.PersonalPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.io.IOException;

public class PersonalStepDef extends BasePage {

    PersonalPage personalPage = new PersonalPage();
    CommonMethod commonMethod = new CommonMethod();


    @And("I complete the below fields")
    public void iCompleteTheBelowFields(DataTable table) throws IOException {
        personalPage.enterDetails(table);
        takeScreenShot();
    }
}
