package StepDefs;

import ExtentReport.ExtentManager;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportHooks {
    private static ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {
        test = ExtentManager.getInstance().createTest(scenario.getName());
        test.log(Status.INFO, "Starting Scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            test.log(Status.FAIL, "Scenario Failed: " + scenario.getName());
        } else {
            test.log(Status.PASS, "Scenario Passed: " + scenario.getName());
        }
    }
}
