package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.id("slider"));
		int width = slider.getSize().width/2;
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 150, 0).perform();
	}

}
