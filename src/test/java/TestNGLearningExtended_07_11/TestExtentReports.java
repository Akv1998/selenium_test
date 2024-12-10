package TestNGLearningExtended_07_11;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReports {

	//public ExtentSparkReporter htmlReporter;//create HTML files and add configuration
	//public ExtentReports extent; //Create test cases and other system configuration
	//public ExtentTest test; //add logs - pass,fail,info
	/*
	@BeforeTest
	public void setReports()
	{
		htmlReporter = new ExtentSparkReporter("./reports/extent.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("XYZ project reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "Vishal");
		extent.setSystemInfo("Build No", "1235");
		extent.setSystemInfo("Organisation", "journeytoautomation.com");			
		
	}
	*/
	@Test
	public void doLogin()
	{
		//test = extent.createTest("Login Test");
		//test.info("Enter username");
		//test.info("Enter password");
		//test.info("Click on submit button");
		System.out.println("Executing Login Test");
		
	}
	
	@Test
	public void doUserRegistration()
	{
		//test = extent.createTest("Registration Test");
		//test.info("Enter first name");
		//test.info("Enter last name");

		Assert.fail();
		
	}
	
	@Test
	public void doIsSkipped()
	{
		//test = extent.createTest("Skipping Test");
		//test.info("Enter first name");
		//test.info("Enter last name");
		
		throw new SkipException("Skipping the test case");
		//test.skip("Test skipped");
		
		//
	}
/*	
	@AfterMethod
	public void updateResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" FAILED", ExtentColor.RED);
			test.fail(m);
		}else if(result.getStatus()==ITestResult.SUCCESS)
		{

			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" PASSED", ExtentColor.GREEN);
			
			test.pass(m);
		}else if(result.getStatus()==ITestResult.SKIP)
		{

			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" SKIPPED", ExtentColor.YELLOW);
			
			test.skip(m);
		}
	}
	
	@AfterTest
	public void endReport()
	{
	extent.flush();
	}*/
}
