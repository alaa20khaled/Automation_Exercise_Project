import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By loginPageTitle=By.xpath("//h2[text()='Login to your account']");
    private By emailField =By.xpath("//input[@data-qa='login-email']");
    private By passwordField=By.xpath("//input[@data-qa='login-password']");
    private By loginBtn=By.xpath("//button[@data-qa='login-button']");


    public boolean isLoginTitleVisible(){
        return waitForVisibility(loginPageTitle).isDisplayed();
    }
    private void enterYourEmail(String email){
        waitForVisibility(emailField).sendKeys(email);
    }
    private void enterYourPassword(String password){
        waitForVisibility(passwordField).sendKeys(password);
    }
    public void loginToYourAccount(String email,String password){
        enterYourEmail(email);
        enterYourPassword(password);
    }
    public void clickLoginBtn(){
        waitForClickable(loginBtn).click();
    }

}
