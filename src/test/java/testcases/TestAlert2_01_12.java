package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@name='proceed']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.dismiss();
		driver.quit();
	}
}
