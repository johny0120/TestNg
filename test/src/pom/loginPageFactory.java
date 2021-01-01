package pom;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
	public class loginPageFactory {

		@Test
		public static void main(String[] args) {
			
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\pom\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 
		 PageFactory.initElements(driver, pageFactorys.class);
		
		 pageFactorys.email.sendKeys("8056039733");
		 pageFactorys.password.sendKeys("preach");
		 pageFactorys.submit.click();
}
	}
