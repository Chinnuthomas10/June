package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");

	}
@Test
public void test()
{
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("total count of links="+links.size());
	
	for(WebElement linklist1 : links)
		
	{
		String linkText = linklist1.getText();
		String linkHref =linklist1.getAttribute("Href");
		System.out.println("Link name:"+linkText);
		System.out.println("Link URL:"+linkHref);
		System.out.println();
		
		verifylink(linkText);
		
		
		
		
	}
}
private void verifylink(String linkText) {
	try
	{
		URI ob=new URI(linkText);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
	if(con.getResponseCode()==200)
			{
		System.out.println("successful response code is 200--"+linkText);
		
			}
	else if(con.getResponseCode()==404)
	{
		System.out.println("Broken link response code is 404"+linkText);
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
		
		
}

		
	


