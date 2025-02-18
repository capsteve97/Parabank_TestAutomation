package Pages;

import StepDefs.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterPage extends Base {

    static By registerBtn = By.xpath("//a[text()='Register']");
    static By registrationForm = By.xpath("//form[@id='customerForm']");
    static By firstName = By.xpath("//input[@id='customer.firstName']");
    static By lastName = By.xpath("//input[@id='customer.lastName']");
    static By address = By.xpath("//input[@id='customer.address.street']");
    static By city = By.xpath("//input[@id='customer.address.city']");
    static By state = By.xpath("//input[@id='customer.address.state']");
    static By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    static By phoneNo = By.xpath("//input[@id='customer.phoneNumber']");
    static By ssn = By.xpath("//input[@id='customer.ssn']");
    static By userName = By.xpath("//input[@id='customer.username']");
    static By password = By.xpath("//input[@id='customer.password']");
    static By confirmPassword = By.xpath("//input[@name='repeatedPassword']");

    public static void verifyHomepage(){
        // Get the title of the current page
        String pageTitle = driver.getTitle();
        // Verify the title using JUnit assertion
        assertEquals("ParaBank | Welcome | Online Banking", pageTitle);
    }

    public static void clickRegisterButtonOnHomePg(){
        WebElement registerBtnOnHomePage = driver.findElement(registerBtn);
        waitUntil(registerBtnOnHomePage);
        registerBtnOnHomePage.click();
        TakeScreenshot("clickRegisterButtonOnHomePg");
    }

    public static void verifyRegisterButtonPresent() {
        try {
            WebElement registerButton = driver.findElement(registerBtn);
            waitUntil(registerButton);
            TakeScreenshot("verifyRegisterButtonPresent");
            assertTrue(registerButton.isDisplayed(), "Register button is present on the page");
        } catch (NoSuchElementException e) {
            assertEquals(false, true, "Register button should be present on the page");
        }
    }

    public static void IsRegistrationFormGenerated(){
        WebElement registerForm = driver.findElement(registrationForm);
        waitUntil(registerForm);
        boolean isFormPresent = registerForm.isDisplayed();
        try {
            assertTrue(isFormPresent, "Registration form is present");
        }
        catch (NoSuchElementException e){
            fail("Form should get generated");
        }
        TakeScreenshot("RegistrationForm");
    }

    public static void fillRegistrationForm(){
        driver.findElement(firstName).sendKeys(properties.getProperty("FirstName"));
        driver.findElement(lastName).sendKeys(properties.getProperty("LastName"));
        driver.findElement(address).sendKeys(properties.getProperty("Address"));
        driver.findElement(city).sendKeys(properties.getProperty("City"));
        driver.findElement(state).sendKeys(properties.getProperty("State"));
        driver.findElement(zipCode).sendKeys(properties.getProperty("ZipCode"));
        driver.findElement(phoneNo).sendKeys(properties.getProperty("Phone"));
        driver.findElement(ssn).sendKeys(properties.getProperty("SSN"));
        driver.findElement(userName).sendKeys(properties.getProperty("Username"));
        driver.findElement(password).sendKeys(properties.getProperty("Password"));
        driver.findElement(confirmPassword).sendKeys(properties.getProperty("ConfirmPassword"));
    }
}
