package junitpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverificaion {

	public static void main(String[] args) {
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
