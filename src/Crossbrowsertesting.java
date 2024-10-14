import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Crossbrowsertesting {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	
	else
	{
		driver=new EdgeDriver();
	}
	}
	@Test
	public void test()
	{
		driver.get("https://goggle.com");
	}

}
