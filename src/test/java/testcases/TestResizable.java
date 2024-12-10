package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	WebElement resizable =  driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
	new Actions(driver).dragAndDropBy(resizable, 300, 200).perform();
}
}
