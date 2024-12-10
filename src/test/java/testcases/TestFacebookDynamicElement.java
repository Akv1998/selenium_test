package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookDynamicElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		//driver.findElement(By.xpath("//td/div[4]/select")).sendKeys("Connecticut -- CN");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sfsdfsdf");
		driver.findElement(By.id("pass")).sendKeys("dfsfdsfa");
		driver.findElement(By.xpath("//*[contains(@id,'0_5')]")).click();
	
	}
}
