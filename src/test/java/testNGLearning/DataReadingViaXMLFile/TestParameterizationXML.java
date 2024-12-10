package testNGLearning.DataReadingViaXMLFile;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterizationXML {

	@Parameters({"url","browser"})
	@Test
	public void doLogin(String u,String b)
	{
		Date d = new Date();
		System.out.println(u+"------"+b+"----"+d.toString());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
