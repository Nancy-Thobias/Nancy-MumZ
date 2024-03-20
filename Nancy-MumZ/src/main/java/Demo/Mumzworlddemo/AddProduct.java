package Demo.Mumzworlddemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProduct {
	private static WebDriver driver;

	public AddProduct(WebDriver driver) {
		super();
		this.driver = driver;
		
	}

	public static String addProduct() {
		

		WebElement element = driver.findElement(By.xpath("//input[@placeholder='What are you looking for?']"));
		element.sendKeys("lamp");
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@title='Submit your search query']")).click();
		driver.findElement(By.className("item-name-3AC")).click();
		driver.findElement(By.xpath("//button[@title='Add to bag']")).click();
		driver.findElement(By.linkText("View Bag")).click();
		
//		for(int i = 1;i <= 5; i++)
//			driver.findElement(By.xpath("//[@class='product-button_increment-1HW quantity-button_increment-pgq']")).click();
//		THe increment operation could not be accomplished as the class attribute is a compound value
			
		driver.findElement(By.className("proceedToCheckoutBtn-root-2ra")).click();
		
		String actual_value = driver.findElement(By.xpath("//button[@title='Sign up']")).getText();
		System.out.println(actual_value);
		
		
		
		return actual_value;
	}

	

}
