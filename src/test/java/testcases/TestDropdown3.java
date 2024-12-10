package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {
		//CTRL + SHIFT + O
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		//driver.findElement(By.xpath("//td/div[4]/select")).sendKeys("Connecticut -- CN");
		
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Latina");
		WebElement dropdwn = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select select = new Select(dropdwn);
		//select.selectByVisibleText("Latina");
		//select.selectByValue("hi");
		select.selectByIndex(10);
		
		List<WebElement> values = dropdwn.findElements(By.tagName("option"));
		
		System.out.println("total values in the dropdown are "+values.size());
		System.out.println(values.get(0).getText());
		System.out.println(values.get(0).getAttribute("lang"));

		/*System.out.println(values.get(0).getAttribute("val"));

		System.out.println(values.get(1).getAttribute("val"));

		System.out.println(values.get(2).getAttribute("val"));

		System.out.println(values.get(3).getAttribute("val"));*/
		
		
		for(int i = 0; i <values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("value"));
		}
		
		System.out.println("---All the links ----");
		
		WebElement section = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/nav"));
		List <WebElement> links = section.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+links.size());
		
		for(WebElement link : links)
		{
			System.out.println(link.getText()+"-----------"+link.getAttribute("href"));
		}
	}
}
