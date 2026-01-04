import model.User;
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
        User user = new User(
                "Mr",
                "123456",
                "10",
                "May",
                "1999",
                "Alaa",
                "Khaled",
                "MyCompany",
                "Alexandria street",
                "Alexandria",
                "Texas",
                "12345",
                "0100000000",
                "12345",
                "012345678912"
        );

        accountInformationPage.fillAccountInformation(user);

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
