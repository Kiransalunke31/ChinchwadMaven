package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTest() throws InterruptedException
  {
	  
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("opening Flipkart",false);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(7000);
	  driver.close(); 
  }
}
