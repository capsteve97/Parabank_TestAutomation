package StepDefs;

import Pages.RegisterPage;
import cucumber.api.java.en.*;

public class RegistrationStepDef extends Base{

    RegisterPage page;

    @Given("^Chrome Browser is opened$")
    public void chrome_Browser_is_opened() {
        openBrowser();
        loadProperties();
    }

    @Then("^User is On Parabank Website$")
    public void user_is_On_Parabank_Website() {
        page.verifyHomepage();
    }

    @Given("^Register button is present$")
    public void register_button_is_present()  {
        page.verifyRegisterButtonPresent();
    }

    @When("^User clicks on it$")
    public void user_clicks_on_it()  {
        page.clickRegisterButtonOnHomePg();
    }

    @Then("^Register form gets generated$")
    public void register_form_gets_generated()  {
        page.IsRegistrationFormGenerated();
    }

    @When("^User fills the form$")
    public void user_fills_the_form(){
        page.fillRegistrationForm();
    }

    @When("^Click on Register$")
    public void click_on_Register()  {

    }

    @Then("^User gets logged in$")
    public void user_gets_logged_in()  {
        tearDown();
    }


}
