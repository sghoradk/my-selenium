package parameterization;


import org.testng.annotations.DataProvider;

public class DataproviderClass {
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataProvider()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "sharujerry";
		data[0][1] = "genpact@123";
		return data;
	}
	@DataProvider(name="Email")
	public Object[][] getEmailDetails()
	{
		Object[][] data = new Object[1][3];
		data[0][0] = "rohitwhoelse@gmail.com";
		data[0][1] = "Sent from my automation script";
		data[0][2] = "I am so proud of myself :)";
		return data;
	}

}
