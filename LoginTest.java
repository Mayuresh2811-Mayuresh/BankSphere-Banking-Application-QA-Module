package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://example-banksphere.com/login");
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("loginBtn")).click();
        assert driver.getCurrentUrl().contains("dashboard");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
