package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTry {
	
	
	

	@Test(priority=2)
	void setup() {
		
		System.out.println("this is test");
		
	}
    @Test(priority=3)
	void findelem() {
		
		System.out.println("lfinding element");
		Assert.assertEquals(1, 1 );
		
	}
    //added priority key word for priortiy basis test execution
	@Test(priority=1)
	void search() {
		System.out.println("search the element");
		

}
}