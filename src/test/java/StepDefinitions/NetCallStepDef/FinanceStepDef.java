package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.FinancePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.io.IOException;


public class FinanceStepDef extends BasePage {

    FinancePage financePage=new FinancePage();

    @And("I complete the Finance details")
    public void iCompleteTheFinanceDetails(DataTable table) throws IOException {
        financePage.enterDetails(table);
        takeScreenShot();
    }
}
