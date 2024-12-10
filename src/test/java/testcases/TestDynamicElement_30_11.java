package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDynamicElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("sfdsfdsf");

		driver.findElement(By.id("pass")).sendKeys("sfdsfdsf");

		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();

	}

}
