package SampleTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//WebDriver driver;

public class parellelTesting {
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\test\\driv\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\test\\driv\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/");
	
		
	}

}
