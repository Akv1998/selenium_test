package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestNewTabAndPopup {
	
	public static WebDriver driver;
	public static void captureScreenshot() throws IOException
	{

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./screenshot/"+fileName));
	}
	
	public static void captureElementScreenshot(WebElement element) throws IOException
	{

		Date d = new Date();
		String fileName = "Element_"+d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./screenshot/"+fileName));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.journeytoautomation.org/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://gmail.com");
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");

		System.out.println(driver.getTitle());
		
		captureScreenshot();
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		captureElementScreenshot(element);
		
		driver.quit();
	}
	

}
