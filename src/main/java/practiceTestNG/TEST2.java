package practiceTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TEST2 {
	
	@BeforeClass
	void beforeclass2() {
		System.out.println("this will execute before class2");
		
	}
	
	 @AfterClass
	 void afterclass2() {
		 System.out.println("this will execute after CLASS2");
	 }
	 

	
	//before method will execute multiple times before very test method 
	@BeforeMethod
    void beforemethod2() {
		System.out.println("this will execute before every method2 ");
	}
	//this method will execute multiple times after every test method 
	@AfterMethod
	void aftermethod() {
		System.out.println("this will execute after every method 2");				
	}

	
	@Test()
	void setup2() {
		
		System.out.println("this is test2");
		
	}
    @Test()
	void login3() {
		
		System.out.println("logging in 2");
		
	}
    
		
	}


