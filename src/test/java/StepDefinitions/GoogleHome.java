package StepDefinitions;

import PageFunctions.BasePage;
import PageObjects.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class GoogleHome extends BasePage {

    GoogleHomePage googleHomePage=new GoogleHomePage();

    @Given("I search for {string} in search bar")
    public void i_navigate_to_homepage(String text) throws IOException {
        googleHomePage.searchFor(text);

    }

    @Then("I take screenshot")
    public void iTakeScreenshot() throws IOException {
        takeScreenShot();
    }
}
