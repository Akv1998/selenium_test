package testcases;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasicAuth {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	

	}

}
