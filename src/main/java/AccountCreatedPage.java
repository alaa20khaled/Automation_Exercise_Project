import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreatedPage extends BasePage{


    public AccountCreatedPage(WebDriver driver) {
     super(driver);
    }
    private By accountCreatedTitle=By.xpath("//b[text()='Account Created!']");
    private By continueBtn=By.xpath("//a[text()='Continue']");



    public boolean isAccountCreatedVisible(){
       return waitForVisibility(accountCreatedTitle).isDisplayed();
    }
    public HomePage clickContinueBtn(){
        waitForClickable(continueBtn).click();
        return new HomePage(driver);
    }

}
