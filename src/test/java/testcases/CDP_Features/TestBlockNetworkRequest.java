package testcases.CDP_Features;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v127.network.Network;

import com.google.common.collect.ImmutableList;

public class TestBlockNetworkRequest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.jpeg","*.png","*.gif")));

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
}
