package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.carwale.com/");
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/nav/ul/li[3]/div[1]"));
		Actions action = new Actions(driver);		
		action.moveToElement(menu).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Special Reports')]")).click();
	}
}
