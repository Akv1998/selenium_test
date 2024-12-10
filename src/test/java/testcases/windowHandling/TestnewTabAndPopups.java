package testcases.windowHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestnewTabAndPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.idfcfirstbank.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle().length());
		driver.quit();

	}

}
