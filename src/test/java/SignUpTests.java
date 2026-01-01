import org.testng.annotations.Test;

public class SignUpTests extends BaseTests{
    SignUpPage signUpPage;

    @Test
    public void testVaildSignup(){
        signUpPage=new SignUpPage(driver);
        signUpPage.GoToSignupPage();
        signUpPage.signup("abcd","abcd@com.c");
    }
}
