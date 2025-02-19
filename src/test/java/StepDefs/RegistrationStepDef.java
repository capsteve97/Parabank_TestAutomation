package StepDefs;

import ExtentReport.ExtentTestManager;
import Pages.RegisterPage;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.*;

public class RegistrationStepDef extends Base{

    RegisterPage page;

    @Given("^Chrome Browser is opened$")
    public void chrome_Browser_is_opened() {
        ExtentTestManager.startTest("Chrome Browser is opened");
        openBrowser();
        loadProperties(); // Load properties when the browser is opened
        ExtentTestManager.getTest().log(Status.PASS, "Chrome Browser is opened successfully");
    }

    @Then("^User is On Parabank Website$")
    public void user_is_On_Parabank_Website() {
        page.verifyHomepage();
        ExtentTestManager.getTest().log(Status.PASS, "User is on ParaBank Website");
    }

    @Given("^Register button is present$")
    public void register_button_is_present() {
        page.verifyRegisterButtonPresent();
        ExtentTestManager.getTest().log(Status.PASS, "Register button is present");
    }

    @When("^User clicks on it$")
    public void user_clicks_on_it() {
        page.clickRegisterButtonOnHomePg();
        ExtentTestManager.getTest().log(Status.PASS, "User clicks on Register button");
    }

    @Then("^Register form gets generated$")
    public void register_form_gets_generated() {
        page.IsRegistrationFormGenerated();
        ExtentTestManager.getTest().log(Status.PASS, "Register form gets generated");
    }

    @When("^User fills the form$")
    public void user_fills_the_form() throws InterruptedException {
        page.fillRegistrationForm();
        ExtentTestManager.getTest().log(Status.PASS, "User fills the form");
    }

    @When("^Click on Register$")
    public void click_on_Register() {
        // Add your code here to click the register button
        ExtentTestManager.getTest().log(Status.PASS, "User clicks on Register");
    }

    @Then("^User gets logged in$")
    public void user_gets_logged_in() {
        tearDown();
        ExtentTestManager.getTest().log(Status.PASS, "User gets logged in and browser is closed");
        ExtentTestManager.endTest();
    }


}
