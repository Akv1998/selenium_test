package testcases.windowHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTabsAndPopups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.idfcfirstbank.com/");
		driver.findElement(By.id("dropdownMenuLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"login-dropdonw-li\"]/div/div/div/div[1]/div/a")).click();
		
		System.out.println("----Generating windows ids for the first window ----");
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> iterate = winIds.iterator();
		String firstWindow = iterate.next();
		
		System.out.println(firstWindow);
		
		//array a[] = {22,33,44,22}; list
		

		System.out.println("----Generating windows ids for the second window ----");
		winIds = driver.getWindowHandles();
		iterate = winIds.iterator();
				
		iterate.next();
		String secondWindow = iterate.next();
		System.out.println(secondWindow);
		
		
		driver.switchTo().window(secondWindow);
		
		driver.findElement(By.xpath("//*[@id='app']/section/div/div[2]/div[2]/div/div[1]/form/div[1]/div/div[1]/div/input")).sendKeys("32432432432");
		driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/a/p")).click();
		System.out.println("----Generating windows ids for the second window ----");
		winIds = driver.getWindowHandles();
		iterate = winIds.iterator();
				
		iterate.next();
		iterate.next();
		String thirdWindow = iterate.next();
		System.out.println(thirdWindow);
		

		driver.switchTo().window(thirdWindow);
		driver.findElement(By.xpath("//*[@id=\"dropdownMenuHelp\"]")).click();
		
		driver.switchTo().window(firstWindow);
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"desktop-top-nav-container\"]/ul[2]/li[3]/a")).click();
		
		//driver.close(); //you can close current window/tab
		driver.quit(); // close all the window 
	}

}
