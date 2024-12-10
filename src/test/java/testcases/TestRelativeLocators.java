package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestRelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.wpeverest.com/user-registration/customer-onboarding-form/");
		//driver.get(null)
		WebElement above = driver.findElement(RelativeLocator.with((By.tagName("input"))).above(By.tagName("select")));
		above.sendKeys("Delhi");

		WebElement below = driver.findElement(RelativeLocator.with((By.tagName("input"))).below(By.tagName("select")));
		below.sendKeys("XYZ company");
		
		WebElement rightOf = driver.findElement(RelativeLocator.with((By.tagName("input"))).toLeftOf(By.tagName("select")));
		rightOf.sendKeys("110022");
		
		
		WebElement near = driver.findElement(RelativeLocator.with((By.tagName("input"))).near(By.xpath("//*[@id=\"first_name_field\"]/label")));
		near.sendKeys("Hemant");
		
	}

}
