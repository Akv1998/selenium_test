package testcases;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v126.security.Security;

public class TestBadSsl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(false));

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	}

}
