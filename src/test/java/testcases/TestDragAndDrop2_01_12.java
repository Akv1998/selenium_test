package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggableElement, droppableElement).perform();

	}

}
