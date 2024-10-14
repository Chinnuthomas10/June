package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goggle {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.Google.com");


	}
	@Test
	public void test()
	{
		driver.findElement(By.id("APjFqb")).sendKeys("facebook");
		driver.findElement(By.name("btnk")).click();
		
	}

}
