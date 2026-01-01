import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
   private WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    // Locators
    private By userName=By.xpath("//input[@data-qa='signup-name']");
    private By emailField=By.xpath("//input[@data-qa='signup-email']");
    private By signupButton=By.xpath("//button[@data-qa='signup-button']");
    private By signupPage=By.cssSelector("a[href='/login']");

    private WebElement waitForVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    private WebElement waitForClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void GoToSignupPage(){
        waitForClickable(signupPage).click();
    }
    public void signup(String username,String email){
        waitForVisibility(userName).sendKeys(username);
        waitForVisibility(emailField).sendKeys(email);
        waitForClickable(signupButton).click();
    }


}
