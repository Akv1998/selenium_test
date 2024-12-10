package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBrowser {

	static String browser = "chrome";
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//Implicit and explicit wait
		//CTRL + SHIFT + O
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}else if(browser.equals("edge"))
		{
		 driver = new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
		driver = new FirefoxDriver();
		}
		/*Options op = driver.manage();
		Window win = op.window();
		win.maximize();*/
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.get("https://google.com");
		driver.navigate().to("https://gmail.com");
		
		String actualTitle = driver.getTitle(); //actual title
		String expectedTitle = "Gmail.com";
		
		System.out.println(actualTitle.length());
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fails");
		}

		//WebElement inputBox = driver.findElement(By.id("identifierId"));
		//inputBox.sendKeys("hemanttestengineer@gmail.com");
		//inputBox.click();
		driver.findElement(By.id("identifierId")).sendKeys("hemant.gandhi@yourcorporateEmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();

		//Thread.sleep(10000);
		//WebElement password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));//.sendKeys("sfsdfds");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("sfsdfds");
		//wait.until(ExpectedConditions.elementToBeClickable(password));
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passwordNext']/div/button"))).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());
//driver.close();///close the current tab/current session/ if it is last then the browser
		//driver.quit();//close all session of a browser
	}
}
