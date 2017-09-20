
package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in");
  }
}
