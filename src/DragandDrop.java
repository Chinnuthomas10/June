import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https:/demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest2=driver.findElement(By.xpath(""))
				
				
		
	}
	
		
	}


}
