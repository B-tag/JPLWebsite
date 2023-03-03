package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions", "PageFunction"}
        , monochrome = true
        , stepNotifications = true
        , plugin = {"pretty"
        , "junit:target/Report/Junit_Reports/junitReports.xml"
        , "html:target/Report/HTML_Report/HtmlReports.html"
        , "json:target/Report/cucumber-Report/cucumber.json"
        , "rerun:target/Report/rerun_Report/rerunReport.txt"
}

        , tags = "@Google_search"
)

public class TestRunner {

}
