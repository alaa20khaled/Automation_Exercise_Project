import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactFormTests extends BaseTests{

    @Test
    public void testValidFillContactForm(){
    ContactUSPage contactUSPage=homePage.clickContactUsBtn();
    contactUSPage.fillContactForm("alaa","alaa@wa.co","dfhlfhsdfh","hofhsjf");
    contactUSPage.clickSubmitBtn();
    assertTrue(contactUSPage.isSuccessfulMessageDisplayed());
    contactUSPage.clickHomeBtn();
    assertTrue(homePage.isHomePageDisplayed());
    }
}
