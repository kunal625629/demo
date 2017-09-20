package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class flipkart {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
  }
}
