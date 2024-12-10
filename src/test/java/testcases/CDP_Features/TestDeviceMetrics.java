package testcases.CDP_Features;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v128.emulation.Emulation;

public class TestDeviceMetrics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		
		
		
		

	}

}
