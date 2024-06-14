package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	

	WebDriver  driver;
	
@BeforeClass
@Parameters({"browser,url"})
	void setup(String browser, String app) {
	
	if(browser.equalsIgnoreCase("chrome")) 
	{
		driver= new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox")) 
	{
		driver= new FirefoxDriver();
		
	}
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// so this will work as above driver.get url.
	    //driver.get(app);
	}

@Test
    void logo() {	
    WebElement logo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1706326081969']"));
    
    Assert.assertTrue(logo.isDisplayed(),"logo is not  displayed");
    
    }


    @Test
     void title() {
    	 String title = driver.getTitle();
  
    	 Assert.assertEquals(title, "OrangeHRM","title is not matched");
     }
}


