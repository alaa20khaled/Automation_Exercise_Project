import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests{
@Test
    public void testLoginWithValidEmailAndPassword(){

    LoginPage loginPage=homePage.GoToLoginPage();
    assertTrue(loginPage.isLoginTitleVisible());
    loginPage.loginToYourAccount("acd@az.co","123456");
    loginPage.clickLoginBtn();
    assertTrue(homePage.isLoggedInAsVisible());
    DeleteAccountPage deleteAccountPage=homePage.clickDeleteAccountBtn();
    assertTrue(deleteAccountPage.isAccountDeletedVisible());

}
@Test
    public void testLoginWithIncorrectEmailAndPassword(){

    LoginPage loginPage=homePage.GoToLoginPage();
    assertTrue(loginPage.isLoginTitleVisible());
    loginPage.loginToYourAccount("abc@de.fg","1234");
    loginPage.clickLoginBtn();
    assertTrue(loginPage.isErrorMessageDisplayed());
}

    @Test
    public void testLogoutUser(){

        HomePage loggedHome = loginWithValidUser();

        assertTrue(loggedHome.isLoggedInAsVisible());

        loggedHome.clickLogoutBtn();


    }

}
