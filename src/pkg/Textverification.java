package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("text is present");
	
}
else
{
	System.out.println("text is not present");
	
}

	}

}
