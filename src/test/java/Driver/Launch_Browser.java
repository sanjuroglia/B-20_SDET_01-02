package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {
public static WebDriver driver;
 static String path;
@BeforeSuite
 public void Launch()
 {
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://opensource-demo.orangehrmlive.com/");
 }
  @AfterSuite
  public void close()
  {
	  driver.close();
  }
}
