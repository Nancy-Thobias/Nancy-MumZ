package Demo.Mumzworlddemo;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	@Test
	public void testRegister() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Register d = new Register(driver);
		String actual_value = d.registerUser();
		
		assertEquals(actual_value,"Login");
	}
}
