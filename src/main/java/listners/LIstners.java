package listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//we have to this parameter to integrate custom listner interface methods here
@Listeners(listners.Newlistners.class)
public class LIstners {
	@Test
	void test1()
	{
		System.out.println("this is a test1");
		Assert.assertEquals("a", "a");
		
	}
	@Test
	void test2()
	{
		System.out.println("this is a test2");
		Assert.assertEquals("a", "b");
		
	}
	@Test
	void test3()
	{
		System.out.println("this is a test3");
		throw new SkipException("skip test");
		
	}
}

