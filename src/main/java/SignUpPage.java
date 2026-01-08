import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage extends BasePage{


    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    // Locators
    private By userName=By.xpath("//input[@data-qa='signup-name']");
    private By emailField=By.xpath("//input[@data-qa='signup-email']");
    private By signupButton=By.xpath("//button[@data-qa='signup-button']");
    private By signUpTitle=By.xpath("//h2[text()='New User Signup!']");


    public AccountInformationPage clickSignUpButton(){
        waitForClickable(signupButton).click();
        return new AccountInformationPage(driver);
    }
    public void signup(String username,String email){
        waitForVisibility(userName).sendKeys(username);
        waitForVisibility(emailField).sendKeys(email);

    }
    public boolean isNewUserSignupVisible(){
        return waitForVisibility(signUpTitle).isDisplayed();
    }


}
