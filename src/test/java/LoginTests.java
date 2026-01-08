import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests{
@Test
    public void testLoginWithValidEmailAndPassword(){
    assertTrue(homePage.isHomePageDisplayed());
    LoginPage loginPage=homePage.GoToLoginPage();
    assertTrue(loginPage.isLoginTitleVisible());
    loginPage.loginToYourAccount("acd@az.co","123456");
    loginPage.clickLoginBtn();
    assertTrue(homePage.isLoggedInAsVisible());
    DeleteAccountPage deleteAccountPage=homePage.clickDeleteAccountBtn();
    assertTrue(deleteAccountPage.isAccountDeletedVisible());

}
}
