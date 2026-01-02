import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    private By homePage =By.id("slider");
    private By signupPage=By.cssSelector("a[href='/login']");





    public SignUpPage GoToSignupPage(){
        waitForClickable(signupPage).click();
        return new SignUpPage(driver);
   }

    private WebElement waitForVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitForClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean isHomePageDisplayed(){
        return waitForVisibility(homePage).isDisplayed();
    }
}
