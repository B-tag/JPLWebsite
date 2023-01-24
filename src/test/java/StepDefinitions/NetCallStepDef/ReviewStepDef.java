package StepDefinitions.NetCallStepDef;

import PageFunctions.BasePage;
import PageObjects.NetCallPage.ReviewPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ReviewStepDef extends BasePage {

    ReviewPage reviewPage = new ReviewPage();

    @When("I click next on review page for confirmation")
    public void iClickNextOnConfirmationNext() throws InterruptedException {
        reviewPage.clickNext();
    }

    @And("I check the review information based on my details")
    public void iCheckTheReviewInformationBasedOnMyDetails(DataTable table) {
        reviewPage.compareDetails(table);

    }
}

