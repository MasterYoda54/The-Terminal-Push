package practiceTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
	
	@BeforeClass
	void beforeclass() {
		System.out.println("this will execute before class");
		
	}
	
	 @AfterClass
	 void afterclass() {
		 System.out.println("this will execute after CLASS");
	 }
	 

	
	//before method will execute multiple times before very test method 
	@BeforeMethod
    void beforemethod() {
		System.out.println("this will execute before every method ");
	}
	//this method will execute multiple times after every test method 
	@AfterMethod
	void aftermethod() {
		System.out.println("this will execute after every method ");				
	}

	// enabled=false adding this keyword to test annotation will not that method execute.	
	@Test(enabled=false)
	void setup() {
		
		System.out.println("this is test");
		
	}
    @Test()
	void login() {
		
		System.out.println("logging in");
		
	}
    //added priority key word for priortiy basis test execution
	@Test()
	void teardown() {
		System.out.println("closing the browser");
		
	}

}
