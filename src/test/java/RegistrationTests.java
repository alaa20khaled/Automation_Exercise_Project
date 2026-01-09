import model.User;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationTests extends BaseTests{


@Test
public void testValidSignup() {

    SignUpPage signUpPage = homePage.GoToSignUpPage();

    assertTrue(signUpPage.isNewUserSignupVisible(),
            "New User Signup is not visible");

    signUpPage.signup("ann", "abcd@co.co");

    AccountInformationPage accountInformationPage =
            signUpPage.clickSignUpButton();

    assertTrue(accountInformationPage.isAccountInformationDisplayed(),
            "Account Information page is not displayed");

    // Test Data
    User user = User.builder()
            .title("Mr")
            .password("123456")
            .day("10")
            .month("May")
            .year("1999")
            .firstName("Alaa")
            .lastName("Khaled")
            .company("TestCompany")
            .address1("Street 1")
            .address2("Flat 5")
            .country("India")
            .city("Delhi")
            .state("Delhi")
            .zipCode("12345")
            .mobileNumber("0123456789")
            .build();

    accountInformationPage.fillAccountInformation(user);

    AccountCreatedPage accountCreatedPage =
            accountInformationPage.clickCreateAccountBtn();
    assertTrue(accountCreatedPage.isAccountCreatedVisible(),
            "Account Created message is not visible");


    HomePage loggedHome =
            accountCreatedPage.clickContinueBtn();

    assertTrue(loggedHome.isLoggedInAsVisible(),
            "User is not logged in");

    DeleteAccountPage deleteAccountPage =
            loggedHome.clickDeleteAccountBtn();

    assertTrue(deleteAccountPage.isAccountDeletedVisible(),
            "Account Deleted message is not visible");
    deleteAccountPage.clickContinueBtnToHome();
}
    @Test
    public void testRegisterUserWithExistingEmail(){

        SignUpPage signUpPage=homePage.GoToSignUpPage();
        assertTrue(signUpPage.isNewUserSignupVisible());
        signUpPage.signup("aaa","alaa@wa.co");
        signUpPage.clickSignUpButton();
        assertTrue(signUpPage.isExistingEmailErrorDisplayed());
    }
    @Test
    public void testSignupWithEmptyEmail(){
        SignUpPage signUpPage=homePage.GoToSignUpPage();

        signUpPage.signup("abcd","");
        signUpPage.clickSignUpButton();
    }

}
