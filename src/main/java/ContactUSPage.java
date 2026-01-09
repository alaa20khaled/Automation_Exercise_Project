import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContactUSPage extends BasePage{
    public ContactUSPage(WebDriver driver) {
        super(driver);
    }


    private By getInTouchTitle=By.xpath("//h2[text()='Get In Touch']");
    private By nameField=By.xpath("//input[@data-qa='name']");
    private By emailField=By.xpath("//input[@data-qa='email']");
    private By subjectField=By.xpath("//input[@data-qa='subject']");
    private By messageField=By.id("message");
    private By uploadFileBtn=By.xpath("//input[@class='form-control']");
    private By submitBtn=By.xpath("//input[@data-qa='submit-button']");
    private By successfulMessage=By.xpath("//div[text()='Success! Your details have been submitted successfully.']");
    private By homeBtn=By.xpath("//span[text()=' Home']");


    public boolean isGetInTouchTitleDisplayed(){
      return waitForVisibility(getInTouchTitle).isDisplayed();
    }
    private void enterName(String name){
        waitForVisibility(nameField).sendKeys(name);
    }
    private void enterEmail(String email){
        waitForVisibility(emailField).sendKeys(email);
    }
    private void enterSubject(String subject){
        waitForVisibility(subjectField).sendKeys(subject);
    }
    private void enterMessage(String message){
        waitForVisibility(messageField).sendKeys(message);
    }
    public void fillContactForm(String name, String email, String subject, String message){
        enterName(name);
        enterEmail(email);
        enterSubject(subject);
        enterMessage(message);
    }
    public void clickSubmitBtn(){
        waitForClickable(submitBtn).click();
        driver.switchTo().alert().accept();
    }
    public boolean isSuccessfulMessageDisplayed(){
        return waitForVisibility(successfulMessage).isDisplayed();
    }
    public HomePage clickHomeBtn(){
        waitForClickable(homeBtn).click();
        return new HomePage(driver);
    }


}
