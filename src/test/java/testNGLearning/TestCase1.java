package testNGLearning;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	public void createDbConnection()
	{
		System.out.println("Creating DB connection");
	}
	
	@AfterTest
	public void closeDbConnection()
	{
		System.out.println("Closing DB connection");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching a browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing a browser");
	}
	
	@Test(priority = 1)
	public void doUserRegistration()
	{

		Reporter.log("<a target = \"_blank\"href =\"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\">Screenshot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\"href =\"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\"><img src = \"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\" height = 200 width=200>Screenshot Link</a>");

		
		System.out.println("Executing registration test");
	}
	
	@Test(priority = 2)
	public void doLogin()
	{
		Reporter.log("Inside Login Test");
		System.out.println("Executing login test");
	}
	
}
