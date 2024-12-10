package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		//driver.findElement(By.xpath("//td/div[4]/select")).sendKeys("Connecticut -- CN");
		
		driver.get("https://www.carwale.com/");
		Actions action = new Actions(driver);
		WebElement newCar = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/nav/ul/li[1]/div[1]"));
		action.moveToElement(newCar).perform();
		
		WebElement newCarTable = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/nav/ul/li[1]/div[2]/div[1]/ul"));
		
		newCarTable.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/nav/ul/li[1]/div[2]/div[1]/ul/a[2]")).click();
	
	}
}
