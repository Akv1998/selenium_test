package testNGLearning;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;

public class TestBasics {

	@Test
	public void doLogin()
	{
		//driver.findelemnt by.xpath().sendkeys(hemantgandhi)
		//log code
		ExtentListeners.test.info("Typing username");

		//driver.findelemnt by.xpath().sendkeys(yourpassword)
		ExtentListeners.test.info("Typing password");

		//driver.findelemnt by.xpath().click
		ExtentListeners.test.info("click on login");
	}
	@Test
	public void doReg()
	{

		ExtentListeners.test.info("Enter first name");
		ExtentListeners.test.info("Enter last name");
		Assert.fail("User reg failed");
	}
	@Test
	public void doSkip()
	{
		throw new SkipException("Skipping test cases");
	}
}
