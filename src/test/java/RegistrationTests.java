import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationTests extends BaseTests{

    @Test
    public void verifySignupTitleIsVisible(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        assertTrue(signUpPage.isNewUserSignupVisible());
    }
    @Test
    public void testVaildSignup(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("abcd","abcd@com.c");
        AccountInformationPage accountInformationPage=signUpPage.clickSignUpButton();
        assertTrue(accountInformationPage.isAccountInformationDisplayed(),"account information is not displayed");
        accountInformationPage.selectGender("Mr");

   }
    @Test
    public void testSignupWithEmptyUserName(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("","abcd@com.c");
        signUpPage.clickSignUpButton();
    }
    @Test
    public void testSignupWithEmptyEmail(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("abcd","");
        signUpPage.clickSignUpButton();
    }

}
