package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_example {
	
	@Test
	//if this method fails then all those methods which are dependent on this 
	// will get skipped 
	void startbike() {
		System.out.println("bike shas started");
		Assert.fail();
		
	}
	@Test(dependsOnMethods = {"startbike"})
	void driverbike() {
		System.out.println("started driving");
	}
	
	@Test(dependsOnMethods = {"driverbike"})
	void parkbike() {
		System.out.println("parking the bike");	
	}
	//alwaysRun=true)this basically means this method will always execute even though 
	//above methods on which it dependent methods fail =driverbike(),parkbike() 
	@Test(dependsOnMethods = {"driverbike","parkbike"},alwaysRun=true)
	void stopbike() {
		System.out.println("stopping the bike ");
	}

}
