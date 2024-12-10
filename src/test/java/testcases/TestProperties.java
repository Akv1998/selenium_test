package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProperties {
	
	/*
	 * Log4J dependency
	 * Logger - getLogger() - INFO, DEBUG, k
	 * Log4j Properties - PropertyConfigurator
	 * Appenders - store the log files, pattern etc
	 * 
	 */
	static WebDriver driver;
	static Properties OR = new Properties();
	static Properties config = new Properties();
	static Logger log = Logger.getLogger(TestProperties.class);
	
	static void click(String locatorKey)
	{
		driver.findElement(By.name(OR.getProperty(locatorKey))).click();
		log.info("Clicking on "+locatorKey);
	}
	
	static void type(String locatorKey,String value)
	{
		driver.findElement(By.xpath(OR.getProperty(locatorKey))).sendKeys(value);	
		log.info("Typing in username");
	
	}
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("Test case started!!");
		FileInputStream fis = new FileInputStream("./src/test/resources/properties/OR.properties");
		OR.load(fis);
		log.info("Or properties file loaded");
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		config.load(fis);

		log.info("Config properties file loaded");
		//driver.findElement(By.xpath("//*[@id="email"]")//not be doing this
		//driver.findElement(By.xpath(OR.getProperty("username_XPATH")).sendKeys("hemant.gandhi");
		System.out.println(OR.getProperty("username_XPATH"));
		
		//driver.get(Config.getProperty("testsiteurl");
		System.out.println(config.getProperty("testsiteurl"));
		
		if(config.getProperty("browser").equals("chrome"))
{
	driver = new ChromeDriver();

	log.info("Chrome browser launched");
}
else if(config.getProperty("browser").equals("firefox"))
{
	driver = new FirefoxDriver();
	log.info("Firefox browser launched");
}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicitwait"))));
		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigated to "+config.getProperty("testsiteurl"));
		driver.findElement(By.xpath(OR.getProperty("username_XPATH"))).sendKeys("hemant.gandhi");	

		log.info("Typing in username");
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys("dsfdsfandhi");
		log.info("Typing in password");
		driver.findElement(By.name(OR.getProperty("login_NAME"))).click();
		log.info("Clicking on login button");
		driver.quit();

		log.info("Test Execution completed!");
	}
}
