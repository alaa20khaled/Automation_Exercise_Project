import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By homePage =By.id("slider");
    private By signupPage=By.cssSelector("a[href='/login']");
    private By loggedInAsUser=By.xpath("//a[contains(text(),' Logged in as ')]");
    private By deleteAccount=By.xpath("//a[text()=' Delete Account']");


    public SignUpPage GoToSignUpPage(){
        waitForClickable(signupPage).click();
        return new SignUpPage(driver);

   }
    public LoginPage GoToLoginPage(){
        waitForClickable(signupPage).click();
        return new LoginPage(driver);

    }


    public boolean isHomePageDisplayed(){
        return waitForVisibility(homePage).isDisplayed();
    }
    public boolean isLoggedInAsVisible(){
        return waitForVisibility(loggedInAsUser).isDisplayed();
    }
    public DeleteAccountPage clickDeleteAccountBtn(){
        waitForClickable(deleteAccount).click();
        return new DeleteAccountPage(driver);
    }

}
