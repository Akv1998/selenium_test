package testcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v126.security.Security;
import org.openqa.selenium.devtools.v128.emulation.Emulation;

public class TestDeviceMatrix {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		Map<String,Object> deviceMetrics = new HashMap<String,Object>();
		deviceMetrics.put("width",600);
		deviceMetrics.put("height",1000);
		deviceMetrics.put("mobile",true);
		deviceMetrics.put("deviceScaleFactor",50);
	
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		//DevTools devTools = ((HasDevTools) driver).getDevTools();
		//devs.createSession();
		
		///devTools.send(Emulation.setDeviceMetricsOverride(200, 1000, 50, true, java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));

		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
