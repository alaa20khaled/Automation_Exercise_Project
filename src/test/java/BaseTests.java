import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class BaseTests {
    WebDriver driver;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        homePage=new HomePage(driver);
        assertTrue(homePage.isHomePageDisplayed(),
                "Home page is not displayed");

    }

    protected HomePage loginWithValidUser(){
        LoginPage loginPage = homePage.GoToLoginPage();
        loginPage.loginToYourAccount("alaa@wa.co", "123456");
        loginPage.clickLoginBtn();
        return homePage;
    }


    @AfterMethod
    public void teardown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
