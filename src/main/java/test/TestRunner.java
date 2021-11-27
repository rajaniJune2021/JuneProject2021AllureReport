package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/testFeatureFiles/registration.feature",glue = {"stepDefinitions"},  plugin = {"html:target/cucumberHtmlReport","pretty:target/cucumberPretty.txt"},
        format = {"pretty","json:target/reports/report.json"}
        //tags="@quickTest"
        //tags = "@Regression"
)

public class TestRunner {



}
