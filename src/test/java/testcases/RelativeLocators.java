package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	/*
	 * Above
	 * Below
	 * rightOf
	 * leftOf
	 * near
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.gmail.com/");
		WebElement xyz = driver.findElement(RelativeLocator.with(By.className("i9lrp.mIZh1c")).above(By.tagName("div")));
		System.out.println(xyz.getTagName());
		
	}

}
