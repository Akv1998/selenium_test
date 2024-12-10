package testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTabsAndPopups {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.axisbank.com/");
		
		//List - when we can accept duplicate values - hemant yasha poonam hemant
		//Set - only unique element // winid - 1,2,3,1
		//winIds - contains tottal window whole set
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> iter = winIds.iterator();
		String firstWindow = iter.next();
		System.out.println(firstWindow);
		
		
		driver.findElement(By.xpath("/html/body/header/div[3]/div[1]/div/div/div/ul[2]/li[2]/a")).click();//whatsap
		winIds = driver.getWindowHandles();
		iter = winIds.iterator();
		firstWindow = iter.next();
		String secondWindow = iter.next();
		System.out.println(secondWindow);
		
		driver.switchTo().window(secondWindow);
		driver.findElement(By.xpath("//*[@id=\"txt_txtMobile\"]")).sendKeys("8810201221");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_WhatsAppBanking1_updatepanel2\"]/div[1]/footer/div/div[1]/ul/li/a")).click();
		winIds = driver.getWindowHandles();
		iter = winIds.iterator();
		firstWindow = iter.next();
		secondWindow = iter.next();
		String thirdWindow = iter.next();
		System.out.println(thirdWindow);
		
		driver.switchTo().window(thirdWindow);
		driver.findElement(By.xpath("//li[@id='Personal']/a")).click();
		
		driver.switchTo().window(firstWindow);
		driver.findElement(By.xpath("//*[@id=\"Aboutus\"]/a")).click();
		TestNewTabAndPopup.captureScreenshot();
		
	}

}
