package testNGLearning;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority = 1)
	public void doUserRegistration()
	{
		System.out.println("Executing registration test");
		Assert.fail();
	}
	
	@Test(priority = 2,dependsOnMethods = "doUserRegistration")
	public void doLogin()
	{
		System.out.println("Executing login test");
	}
	
	@Test(priority =3)
	public void isSkip()
	{
		throw new SkipException("Skipping as the test condition doesnt matches");
		
	}
	
}
