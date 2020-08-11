package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import Driver.Launch_Browser;

public class HomeTest extends Launch_Browser{
	@Test
	public void Logout()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();  
		driver.findElement(By.linkText("Logout")).click();
	}

}
