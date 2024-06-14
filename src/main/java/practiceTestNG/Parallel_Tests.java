package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel_Tests {
	
	WebDriver driver;
	
	@Test
	void logoTest() throws InterruptedException 
	{
	
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
 //assertTrue: This is a method that asserts that a condition is true. 
 //If the condition is false, the test fails.		
		Assert.assertTrue(logo.isDisplayed());
		
		Thread.sleep(4000);
	}
	
	@Test
	void titleTest() throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
	
//assertEquals: This is a method used to compare two values for equality.		
//this checks if the title of the web page (obtained via driver.getTitle()) is equal to "Swag Labs".		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		Thread.sleep(4000);
	}
	
	@AfterMethod
	void TearDownTest()
	{
		driver.quit();
	}
	
	
	
	

}
