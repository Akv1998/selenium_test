package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://jqueryui.com/resources/demos/slider/default.html");
	WebElement slider = driver.findElement(By.id("slider"));
	Actions action = new Actions(driver);
	action.dragAndDropBy(slider, 300, 0).perform();

}
}
