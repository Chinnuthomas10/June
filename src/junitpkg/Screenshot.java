package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				
	}
	@Test
	public void test() throws Exception
	{
		driver.getScreenshotAs(OutputType.FILE);
		File src;
		FileHandler.copy(src, new File("E://gogglescreenshot.png"));
		WebElement button=driver.findElement(By.name("login"));
		File src1 =button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./.Screenshot/buttonscreenshot.png"));
		
		
	}
	
	

}
