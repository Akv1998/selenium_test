package TestNGLearningExtended_07_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class TestParameterization {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(dataProvider="xy")
	public void doLogin(String username,String password) throws InterruptedException
	{
		//driver - entering username -dsfdsfd
		//driver - entering password - dfdf
		//System.out.println(username+"-----"+password);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		System.out.println(username+"-----"+password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "xy")
	public Object[][] getData()
	{
		ExcelReader excel = new ExcelReader("./src/test/resources/excel/testdata.xlsx", 0);
		String sheetName = "LoginTest";
		
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		
		System.out.println("Data from excel "+excel.getCellData(sheetName, 0, 2));
		
		System.out.println("Total rows are : "+rowNum+"Total cols are "+colNum);
		//Total rows are : 3 Total cols are 2
		Object[][] data = new Object[rowNum-1][colNum];//2D array
		/*
		 * 
		 * array arr[0][0] -- approach of array
		 * excel.getCellData(sheetName, 0, 2);
		data[0][0] = excel.getCellData(sheetName, 0, 2);
		data[0][1] = excel.getCellData(sheetName, 1, 2);
		
		data[1][0] = excel.getCellData(sheetName, 0, 3);
		data[1][1] = excel.getCellData(sheetName, 1, 3);
		*/
		
		//2,3
		for(int rows=2;rows<=rowNum;rows++)
		{
			//0,1
			for(int cols=0;cols<colNum; cols++)
			{
				//data[0][0] -vishal
				//data[0][1] - sdfsdf
				
				//data[1][0] - hemant
				//data[1][1]
				data[rows-2][cols] = excel.getCellData(sheetName, cols, rows);
				
				/*excel.getCellData(sheetName, 0, 2);
				excel.getCellData(sheetName, 1, 2);
				excel.getCellData(sheetName, 0, 3);
				excel.getCellData(sheetName, 1, 3);*/
			}
			
			/*2 for loops 
			first is out for loops
			it will stay the same till the time the inner loop iteration get false 
			inner loop will iterate for every iteration of the outer loop with a fresh start*/
		}
			
		
		return data;
	}
}
