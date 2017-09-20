
package TestScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Verify_Login {
	@Test
	public void f() throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
	}}


