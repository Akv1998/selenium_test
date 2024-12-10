package testcases;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v127.network.Network;

import com.google.common.collect.ImmutableList;

public class TestBlockNetworkRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg,*.jpeg,*.png,*.gif")));

		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	}

}
