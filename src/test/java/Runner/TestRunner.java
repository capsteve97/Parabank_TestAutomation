package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Registration.feature",
        glue = "StepDefs",
        plugin = {"pretty",
                "html:target/cucumber-reports"
        }
)
public class TestRunner {
}
