package testNGLearning;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class CustomListners implements  ITestListener{
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" PASSED", ExtentColor.GREEN);
		test.pass(m);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" FAILED", ExtentColor.RED);
		test.fail(m);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a target = \"_blank\"href =\"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\">Screenshot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\"href =\"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\"><img src = \"C:\\Users\\hemant.gandhi\\Desktop\\Selenium_Logo.png\" height = 200 width=200>Screenshot Link</a>");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" SKIPPED", ExtentColor.YELLOW);
		
		test.skip(m);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
