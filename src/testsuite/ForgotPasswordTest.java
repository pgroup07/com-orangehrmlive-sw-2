package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        // Verify the text ‘Reset Password
        String expectedMessage = "Reset Password";
        String actualMessage = driver.findElement(By.xpath("//h6")).getText();
        //Verify the text ‘Reset Password’
        Assert.assertEquals("Error Message is not Displayed", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closerBrowser();
    }
}
