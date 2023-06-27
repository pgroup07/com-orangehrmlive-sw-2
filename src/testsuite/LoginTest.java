package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter “Admin” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        // Enter “admin123" password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        // Click on Login Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the ‘Dashboard’ text is display

        String actualMessage = "Dashboard";

        String expectedMessage = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("Error Message is not Displayed", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closerBrowser();
    }
}
