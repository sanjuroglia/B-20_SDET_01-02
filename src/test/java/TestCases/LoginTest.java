package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import Driver.Launch_Browser;

public class LoginTest extends Launch_Browser
{
String ExpTitle;
@Test
  public void login()
  {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
  }
@Test
  public void forget()
  {
	driver.findElement(By.linkText("Forgot your password?")).click();
	AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	driver.navigate().back();
}
}