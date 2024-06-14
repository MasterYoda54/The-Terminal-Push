package practiceTestNG;

import org.testng.annotations.Test;

public class Grouping_test {
	
	@Test(groups = "pro")
	void hi1() {
		System.out.println("magnus");
	}
	@Test(groups = "pro")
	void hi2() {
		System.out.println("ember");
	}
	@Test(groups = "noob")
	void hi3() {
		System.out.println("voker");
	}
	@Test(groups = "noob")
	void hi4() {
		System.out.println("dp");
	}
	//remeber the bracket here curly one 
	@Test(groups = {"pro","noob"})
	void hi5() {
		System.out.println("pango");
	}

}
