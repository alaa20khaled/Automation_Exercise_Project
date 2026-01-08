import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage extends BasePage{

//Constructor
    public DeleteAccountPage(WebDriver drivr) {
        super(drivr);
    }
//Locators
    private By deleteAccountTitle=By.xpath("//b[text()='Account Deleted!']");
    private By continueAfterDeleteBtn=By.xpath("//a[text()='Continue']");

    public boolean isAccountDeletedVisible(){
        return waitForVisibility(deleteAccountTitle).isDisplayed();
    }
    public HomePage clickContinueBtnToHome(){
        waitForClickable(continueAfterDeleteBtn).click();
        return new HomePage(driver);
    }

}
