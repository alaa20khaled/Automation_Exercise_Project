import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUSPage extends BasePage{
    public ContactUSPage(WebDriver driver) {
        super(driver);
    }

    private By contactUsBtn=By.linkText(" Contact us");
    private By getInTouchTitle=By.xpath("//h2[text()='Get In Touch']");


    public void clickContactUsBtn(){
        waitForClickable(contactUsBtn).click();
    }
    public boolean isGetInTouchTitleDisplayed(){
      return waitForVisibility(getInTouchTitle).isDisplayed();
    }
}
