package Pecode;

import PageObjectEatStreet.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PecodeTests extends TestInit {

    @Test
    public void checkCorectEmail() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("Julia");
        pecodePage.inputPassword().sendKeys("12345Yy");
        pecodePage.loginBtn().click();

        //Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }
}
