package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbals {
	ChromeDriver driver;
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.com");
	
}
	@Test
	
		public void test()
		{
String actualtitle=driver.getTitle();
String exptitle="Rishi herbal";
System.out.println("title"+actualtitle);
if(actualtitle.equals(exptitle))
{
	System.out.println("pass");
	
}
else
{
	System.out.println("fail");
	
}
List<WebElement>linklist=driver.findElements(By.tagName("a"));
System.out.println("total links="+linklist.size());


		}
			
	
		

	}	

	

