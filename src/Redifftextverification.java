import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftextverification {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver.get("https://register.rediff.com/register/register.php?ForName=user_details");
		
				
	}
	@Test
	public void copypaste()
	{
		WebElement button=driver.findElement(By.xpath(" //*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String text=button.getAttribute("value");
		if(text.equals("check availability"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
	

}
