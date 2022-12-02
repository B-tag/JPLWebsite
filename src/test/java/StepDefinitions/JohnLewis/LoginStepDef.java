package StepDefinitions.JohnLewis;

import PageFunctions.BasePage;
import PageObjects.JohnLewis.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class LoginStepDef extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Then("I should see the login page")
    public void i_should_see_the_login_page() throws IOException {
        loginPage.assertLoginPage();
        takeScreenShot();
    }

    @Given("I select create an account button")
    public void i_select_create_an_account_button() throws IOException {
        loginPage.clickCreateAccount();
        takeScreenShot();
    }

}
