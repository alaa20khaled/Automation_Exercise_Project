import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestcasesTest extends BaseTests{

    @Test
    public void isTestCasesPageDisplayed(){
        TestCasesPage testCasesPage=homePage.clickTestCasesBtn();
       assertTrue(testCasesPage.isTestCasesPageDisplayed());
    }
}
