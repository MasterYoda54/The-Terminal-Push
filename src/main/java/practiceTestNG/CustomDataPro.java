package practiceTestNG;

public class CustomDataPro {
	
	//here i have kept data provider in diffrent class to test it 
	     @org.testng.annotations.DataProvider(name="datapro")
	 
		public Object[][] getData()
		{
			Object[][]data ={{"abc@gmail.com","abc"},{"xyxz@gmail.com","xyz"},{"mno@gmail.com","moo"}};
			return data;
		}
}
