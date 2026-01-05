import model.User;
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

    private By firstName=By.id("first_name");
    private By lastName=By.id("last_name");
    private By company=By.id("company");
    private By address =By.id("address1");
    private By secondAddress= By.id("address2");
    private By countryList =By.id("country");
    private By state=By.id("state");
    private By city=By.id("city");
    private By zipcode=By.id("zipcode");
    private By mobileNum = By.id("mobile_number");
    private By createAccountBtn=By.xpath("//button[text()='Create Account']");




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
        return new Select(waitForVisibility(locator));

    }
    //AccountInformation
    public boolean isAccountInformationDisplayed(){
       return waitForVisibility(accountInformationTitle).isDisplayed();
    }
    public void selectGender(String title){
        By maleOrFemaleRadioBtn=By.xpath("//label[text()='"+title+".']");
        waitForClickable(maleOrFemaleRadioBtn).click();
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
   public void fillAccountInformation(User user){
        selectGender(user.getTitle());
        enterPassword(user.getPassword());
        selectBirthdate(user.getDay(), user.getMonth(), user.getYear());
        clickNewsLetterBtn();
        clickOffersBtn();
        enterFirstName(user.getFirstName());
        enterLastName(user.getLastName());
        enterCompanyName(user.getCompany());
        enterAddress(user.getAddress1());
        enterAddress2(user.getAddress2());
        enterCountryName(user.getCountry());
        enterCityName(user.getCity());
        enterStateName(user.getState());
        enterZIPCode(user.getZIPCode());
        enterMobilNumber(user.getMobileNumber());
     }



    //Address Information
    public void enterFirstName(String fName){
        waitForVisibility(firstName).sendKeys(fName);
    }
    public void enterLastName(String lName){
        waitForVisibility(lastName).sendKeys(lName);
    }
    public void enterCompanyName(String companyName){
        waitForVisibility(company).sendKeys(companyName);
    }
    public void enterAddress(String address1){
        waitForVisibility(address).sendKeys(address1);
    }
    public void enterAddress2(String address2){
        waitForVisibility(secondAddress).sendKeys(address2);
    }
    public void enterCountryName(String countryName){
        selectItem(countryList).selectByVisibleText(countryName);
    }
    public void enterStateName(String stateName){
        waitForVisibility(state).sendKeys(stateName);
    }
    public void enterCityName(String cityName){
        waitForVisibility(city).sendKeys(cityName);
    }
    public void enterZIPCode(String ZIPCode ){
        waitForVisibility(zipcode).sendKeys(ZIPCode);
    }
    public void enterMobilNumber(String mobNumber){
        waitForVisibility(mobileNum).sendKeys(mobNumber);
    }
    public AccountCreatedPage clickCreateAccountBtn(){
        waitForClickable(createAccountBtn).click();
        return new AccountCreatedPage(driver);
    }
}
