package practiceTestNG;

import org.testng.annotations.Test;

public class DataProvider {
	//i have added this parameter into this class to use data which is stored in CustomDataPro.class
	 @Test(dataProvider = "datapro",dataProviderClass=CustomDataPro.class)
	
	void login(String email,String password) 
	
	{
//dataprovider parameter works as loop it will keep on printing all the emails and password till they last
		System.out.println(email+"     "+password);
	}
	//we should always give name to the data provider so that we can acces it from diffrent class too
		@org.testng.annotations.DataProvider(name="datapro")
	//dataprovider will return either object type or string type two dimensonary 
	
		public Object[][] datapro()
		{
			Object[][]data ={{"abc@gmail.com","abc"},{"xyxz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
			return data;
		}
}
                   //*********************SIDE NOT*************************//
//IF WE PUT THE datapro METHOD INTO DIFFRENT CLASS WE CAN ACESS IT FROM HERE we just have to use some additional 
//parameters like name of class whhere data provider is kept like here class name where data is kept =CustomDataPro
//CustomDataPro.class will be added

//*******@Test(dataProvider = "datapro",dataProviderClass = CustomDataPro.class)*******//           
