package hai;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	 @Test
	  public void f() {
		  driver.get("chrome-extension://ijjbaliojphgfiakfehndobhialecmpl/ntp2.html");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\WebDriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
