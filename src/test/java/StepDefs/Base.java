package StepDefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    static WebDriver driver;

    public static void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C://Users//abanerjee2//Repositories//Parabank_TestAutomation//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
