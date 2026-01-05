import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreatedPage {
   private WebDriver driver;
   private WebDriverWait wait;

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    private By accountCreatedTitle=By.xpath("//b[text()='Account Created!']");
    private By continueBtn=By.xpath("//a[text()='Continue']");

    private WebElement waitForVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitForClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean isAccountCreatedVisible(){
       return waitForVisibility(accountCreatedTitle).isDisplayed();
    }
    public HomePage clickContinueBtn(){
        waitForClickable(continueBtn).click();
        return new HomePage(driver);
    }

}
