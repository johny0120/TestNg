package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageFactorys {
	
	@FindBy(id="email")
	 public static WebElement email;
	@FindBy(name="pass")
	 public static WebElement password;
	@FindBy(name="login")
	 public static WebElement submit;
	
	 
	 

}
