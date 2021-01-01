package SampleTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4LaunchBrowser {
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	
	// Aim To Launch The Browser
	//Google  ; Bing ; Yahoo Calculate The Time Taken To Run The Browser
	// Finally Close The  Browser
	
	@BeforeSuite
	public void launchBrowser() {
		startTime=System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\test\\driv\\chromedriver.exe");

		 driver= new ChromeDriver();
		}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
	}
	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
	}
	@Test
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
	}
	@AfterSuite
	public void closeBrowser() {
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
		driver.quit();
}}