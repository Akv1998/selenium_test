package testNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void validateTitles()
	{
		System.out.println("Beginning");
		String exceptedTitle = "Google"; //excel sheet
		String actualTitle = "Gmail";//driver.getTitle()
		
		/*if(exceptedTitle.equals(actualTitle))
		{
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fails");
		}*/
		
		SoftAssert softAssert = new SoftAssert();
		//isDisplayed, isElementPresent -- boolean
		softAssert.assertEquals(actualTitle, exceptedTitle,"Titles not matching");
		softAssert.assertTrue(false,"Image not present here fails");
		softAssert.fail("Failing the test as the condition is not met");
		System.out.println("Ending");
		
		softAssert.assertAll();
	}

}
