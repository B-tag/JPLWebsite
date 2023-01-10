package StepDefinitions;

import PageFunctions.BasePage;
import PageObjects.JohnLewisHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class HomePageStepDef extends BasePage {

    BasePage basePage = new BasePage();
    JohnLewisHomePage johnLewisHomePage = new JohnLewisHomePage();

    @Given("I navigate to {string} homepage")
    public void i_navigate_to_homepage(String value) throws IOException {
        basePage.navigate(value);
        takeScreenShot();
    }

    @Given("I navigate to {string}")
    public void i_navigate_to(String value) throws IOException {
        basePage.navigate(value);
        takeScreenShot();
    }

    @Given("I accept all cookies")
    public void i_accept_all_cookies() throws IOException {
        johnLewisHomePage.acceptCookies();
        takeScreenShot();
    }

    @When("I click on login to john lewis button")
    public void i_click_on_login_to_john_lewis_button() throws IOException {
        johnLewisHomePage.signIn();
        takeScreenShot();
    }

}
    
