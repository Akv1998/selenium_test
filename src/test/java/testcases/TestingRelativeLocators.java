package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestingRelativeLocators {
	
public static void main(String[] args) {
	/*
	 * relative locators selenium 4.0 onwards
	 * Above
	 * Below
	 * torightOf
	 * toleftOf
	 * near
	 * 
	 */
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.wpeverest.com/user-registration/customer-onboarding-form/");
	
	driver.findElement(RelativeLocator.with((By.tagName("input"))).above(By.tagName("select"))).sendKeys("Delhi");
	
	WebElement below = driver.findElement(RelativeLocator.with((By.tagName("input"))).below(By.tagName("select")));
	below.sendKeys("XYZ company");
	
	WebElement leftOf = driver.findElement(RelativeLocator.with((By.tagName("input"))).toLeftOf(By.tagName("select")));
	leftOf.sendKeys("110220");
	

	WebElement near = driver.findElement(RelativeLocator.with((By.tagName("input"))).near(By.xpath("//*[@id=\"first_name_field\"]/label")));
	near.sendKeys("Hemant");
	


}
}
