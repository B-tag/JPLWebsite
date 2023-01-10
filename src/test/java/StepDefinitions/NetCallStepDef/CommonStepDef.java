package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.CommonMethod;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class CommonStepDef extends BasePage {

    CommonMethod commonMethod = new CommonMethod();

    @Then("I am in the {string} page")
    public void iShouldGoToThePersonalPage(String text ) throws IOException, InterruptedException {
        int index = commonMethod.indexFinder(text);
        commonMethod.assertPage(text,index);
        takeScreenShot();
    }
}
