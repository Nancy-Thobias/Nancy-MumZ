package Demo.Mumzworlddemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	
	private static WebDriver driver;

	public Register(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public static String registerUser() {
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mumzworld.com");
		
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		driver.findElement(By.id("create_account_modal_firstname")).sendKeys("Nancy");
		driver.findElement(By.id("create_account_modal_lastname")).sendKeys("Bejoy");
		driver.findElement(By.id("create_account_modal_email")).sendKeys("nancythobias95@gmail.com");//This email id is already registered with the website
		driver.findElement(By.id("create_account_modal_password")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actual_value = driver.findElement(By.xpath("//button[@class='accountTrigger-trigger-1zu']")).getText();

		System.out.println(actual_value);
		return actual_value;
		
	}

}
