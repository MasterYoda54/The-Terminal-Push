package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel_test2 {
	
	
	WebDriver Driver;
	
	@Test
	void login() throws InterruptedException
	{
		Driver= new ChromeDriver();
		
		Driver.get("https://www.saucedemo.com/v1/index.html");
		
		Driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Assert.assertEquals(Driver.getTitle(),"Swag Labs");
		Thread.sleep(4000);
	}
	@AfterMethod
	void teardown()
	{
		Driver.quit();
		
	}

}
