package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assert_examples {
	
	
	WebDriver  driver;
	
@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	}

@Test
    void logo() {	
    WebElement logo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1706326081969']"));
    
    //this assert true bascially means that we are expecting it to be true.
    //if logo is displayed .assertTrue method will returm true if not it will return false.
    //Assert.assertTrue(logo.isDisplayed(),"logo is not displayed");
    //complete opposite of the above method here logo should not be displayed 
    Assert.assertFalse(logo.isDisplayed(),"logo is  displayed");
    
    }
@Test
     void title() {
    	 String title = driver.getTitle();
   //if both are same title and my given(expected title=OrangeHRM) this test will pass else it will fail 
    	 //on failure this message will print title is not matched.
    	 Assert.assertEquals(title, "OrangeHRM","title is not matched");
     }
}


