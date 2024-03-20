package Demo.Mumzworlddemo;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class AddProductTest {

	
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AddProduct d = new AddProduct(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mumzworld.com");
		String actual_value = d.addProduct();
		assertEquals(actual_value,"Sign up");
		
		
	}
}
