package Pages;

import StepDefs.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterPage extends Base {

    //WebDriver driver;

//    public RegisterPage(WebDriver driver) {
//        this.driver = driver;
//    }

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
        TakeScreenshot();
        registerBtnOnHomePage.click();
        TakeScreenshot();
    }
}
