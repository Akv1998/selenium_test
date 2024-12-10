package testcases.windowHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestTryIt {
	public static WebDriver driver;
	public static void captureScreenshot() throws IOException
	{
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(screenshot, new File("./screenshot/error.jpg"));
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
		
	}
	
	public static void captureScreenshot(WebElement element) throws IOException
	{
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(screenshot, new File("./screenshot/error.jpg"));
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
		
	}
	
public static void main(String[] args) throws IOException {
	//CTRL + SHIFT + O
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	captureScreenshot();
	WebElement runButton = driver.findElement(By.id("runbtn"));

	captureScreenshot(runButton);
	WebElement homeIcon = driver.findElement(By.id("tryhome"));
	homeIcon.click();
	//captureScreenshot(homeIcon);
	System.out.println("----Generating windows ids for the first window ----");
	Set<String> winIds = driver.getWindowHandles();
	Iterator<String> iterate = winIds.iterator();
	String firstWindow = iterate.next();
	String secondWindow = iterate.next();
	driver.switchTo().window(secondWindow);
	captureScreenshot();

	/*
	driver.switchTo().frame("iframeResult");
	//driver.findElement(By.xpath("/html/body/button")).click();
	WebElement elem = driver.findElement(By.xpath("//*[@id=\"mySubmit\"]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	((JavascriptExecutor) driver).executeScript("myFunction()");
	//driver.switchTo().window(firstWindow);
	driver.switchTo().defaultContent();
	

	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println("The frames are "+frames.size());

	for(WebElement frame : frames)
	{
		System.out.println(frame.getAttribute("id"));
	}
	driver.switchTo().defaultContent();
	*/
	
}

}
