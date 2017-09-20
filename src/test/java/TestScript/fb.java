package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fb {
  @Test
  public void f() {
	 WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  
  }
}
