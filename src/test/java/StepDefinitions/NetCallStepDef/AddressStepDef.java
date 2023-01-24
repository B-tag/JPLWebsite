package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.AddressPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.io.IOException;

public class AddressStepDef extends BasePage {

    AddressPage addressPage=new AddressPage();

    @And("I complete the address details")
    public void iCompleteTheAddressDetails(DataTable table) throws IOException {
        addressPage.enterDetails(table);
        takeScreenShot();
    }
}
