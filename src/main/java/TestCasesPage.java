import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage{
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }
private By testCasesTitle=By.xpath("//h2//p[text()='Test Cases']");

    public boolean isTestCasesPageDisplayed(){
        return waitForVisibility(testCasesTitle).isDisplayed();
    }
}
