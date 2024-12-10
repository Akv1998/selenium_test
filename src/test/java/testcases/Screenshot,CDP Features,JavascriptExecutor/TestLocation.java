package testcases;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v126.security.Security;
import org.openqa.selenium.devtools.v128.emulation.Emulation;

public class TestLocation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));
		driver.get("https://www.gps-coordinates.net/my-location");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	}

}
