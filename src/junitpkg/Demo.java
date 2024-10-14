package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		System.out.println("title=+actualtitle");
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}
	}
	@Test
	public void textverification()
	{
		String src=driver.getPageSource();
		if ()
	}
	
	
	
	

}
