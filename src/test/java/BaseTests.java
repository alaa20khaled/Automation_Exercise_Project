import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class BaseTests {
    WebDriver driver;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        homePage=new HomePage(driver);

    }

    @AfterMethod
    public void teardown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
