package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		WebElement iframex = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframex);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("tryhome")).click();
	}
}
