package StepDefinitions;


import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    public static Scenario scenario;
    public static Step beforeStep;

    @Before
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
