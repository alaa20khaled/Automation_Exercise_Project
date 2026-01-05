import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;
//Constructor
    public DeleteAccountPage(WebDriver drivr) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
//Locators
    private By deleteAccountTitle=By.xpath("//b[text()='Account Deleted!']");
}
