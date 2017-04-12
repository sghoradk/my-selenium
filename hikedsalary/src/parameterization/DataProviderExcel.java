package parameterization;

import lib.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	@DataProvider(name="SearchProviderExcel")
	public Object[][] getDataFromDataProvider()
	{
		ExcelDataConfig config = new ExcelDataConfig("D:\\PersonalSpace\\MySelenium\\Test_Data_Search_Gmail.xlsx");
		int rows = config.getRowCount(0);
		Object[][] data = new Object[rows][2];
		data[0][0] = config.getData(0, 0, 0);
		data[0][1] = config.getData(0, 0, 1);
		return data;
	}
}
