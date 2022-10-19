package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions", "PageFunction"}
        , monochrome = true
        , stepNotifications = true
        , plugin = {"pretty"
        , "junit:target/JunitReports/junitReports.xml"
        , "html:target/HtmlReports"
        , "json:target/JsonReports/JasonReport.json"
}

        , tags = "@JohnLewisCreateAccount"
)

public class TestRunner {

}
