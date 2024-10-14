package junitpkg;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	@Before
	public void setup()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Goggle.com");
				
	}
	@Test
	public void titleverification()
	{
		String actualtitle =Driver.getTitle();
		String exptitle="Google";
		System.out.println("title=+Google");
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
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
			
		}
		else
		{
			System.out.println("not present");
		}
			}

}	
	}
		
	}
	
	
