import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignUpTests extends BaseTests{


    @Test
    public void testVaildSignup(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("abcd","abcd@com.c");

    }
    @Test
    public void testSignupWithEmptyUserName(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("","abcd@com.c");
    }
    @Test
    public void testSignupWithEmptyEmail(){
        SignUpPage signUpPage=homePage.GoToSignupPage();
        signUpPage.signup("abcd","");
    }

}
