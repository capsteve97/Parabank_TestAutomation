package Pages;

import StepDefs.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterPage extends Base {

    static By registerBtn = By.xpath("//a[text()='Register']");

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
            assertTrue(registerButton.isDisplayed(), "Register button should be present on the page");
        } catch (NoSuchElementException e) {
            assertEquals(false, true, "Register button should be present on the page");
        }
    }
}
