import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountInformationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //locators
    private By accountInformationTitle= By.xpath("//h2//b[text()='Enter Account Information']");

    public AccountInformationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitForClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public Boolean isAccountInformationDisplayed (){
       return waitForVisibility(accountInformationTitle).isDisplayed();
    }
    public void selectGender(String title){
        By maleOrFemaleRadioBtn=By.xpath("//label[text()='"+title+".']");

    }

}
