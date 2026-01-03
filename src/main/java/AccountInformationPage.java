import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountInformationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //locators (accountInformation)
    private By accountInformationTitle= By.xpath("//h2//b[text()='Enter Account Information']");
    private By enterPassword=By.id("password");
    private By newsLetterBtn=By.id("newsletter");
    private By offersBtn=By.xpath("//label[text()='Receive special offers from our partners!']");
    private By dayDropDownList=By.id("days");
    private By monthDropDownList=By.id("months");
    private By yearDropDownList =By.id("years");

    //locators (address Information)



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
    public Select selectItem(By locator){
        return  new Select(waitForVisibility(locator));

    }
    //AccountInformation
    public Boolean isAccountInformationDisplayed (){
       return waitForVisibility(accountInformationTitle).isDisplayed();
    }
    public void selectGender(String title){
        By maleOrFemaleRadioBtn=By.xpath("//label[text()='"+title+".']");
    }
    public void enterPassword(String password){
        waitForVisibility(enterPassword).sendKeys(password);
    }

    public void selectDay(String day){
        selectItem(dayDropDownList).selectByValue(day);
    }
    public void selectMonth(String month){
        selectItem(monthDropDownList).selectByVisibleText(month);
    }
    public void selectYear(String year){
        selectItem(yearDropDownList).selectByValue(year);
    }

    // date of birth
    public void selectBirthdate(String day,String month,String year){
        selectDay(day);
        selectMonth(month);
        selectYear(year);
    }

    public void  clickNewsLetterBtn(){
        waitForClickable(newsLetterBtn).click();
    }
    public void clickOffersBtn(){
        waitForClickable(offersBtn).click();
    }
   // public void fillAccountInformation(String gender,String password, ){
    // }



    //Address Information
}
