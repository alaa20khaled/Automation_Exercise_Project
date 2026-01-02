import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTests{
    @Test
    public void checkIfHomePageVisible(){
       assertTrue(homePage.isHomePageDisplayed());
    }
}
