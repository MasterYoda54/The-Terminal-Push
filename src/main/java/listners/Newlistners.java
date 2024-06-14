package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Newlistners implements ITestListener {
	
	//ITestContext: This is an interface in TestNG that represents 
	//the context in which a test method is invoked.
	public void onStart(ITestContext arg) 
	
	{
	//So, whenever a test starts, this method will print a message indicating 
	//the start of the test along with its name.
		System.out.println("started test execution..........."+arg.getName());
	}
	//belongs to ITestListner interface will execute when test is finished
	
	public void onFinish(ITestContext arg)
	{
	
       System.out.println("finished the test..........."+arg.getName());
	}
	//belongs to ITestListner interface will execute when test is started

	public void onTeststart(ITestResult arg)
	{
	    System.out.println("on test start the test..........."+arg.getName());

	}
	//belongs to ITestListner interface will execute when test is skipped
	//imp

	public void onTestskipped(ITestResult arg)
	{
	    System.out.println("on skip of the test ..........."+arg.getName());

	}
	//belongs to ITestListner interface will execute when test is sucess
	//imp
  
	public void onTestsucess(ITestResult arg)
	{
		System.out.println("sucess of test........"+arg.getName());
	}
	//belongs to ITestListner interface will execute when test is failed
	//imp
	public void onTestfailure(ITestResult arg)
	{
		System.out.println("failed  test........"+arg.getName());
	}
	
	//not imp but we must define all methods  while using ITestListner interface
	public void onTestfailedButWithInSuccessPercentage(ITestResult arg)
	{
		System.out.println("failed  test........"+arg.getName());
	}

}
