package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	WebDriver driver;
	By fbemail=By.name("email");
	By fbpwd=By.name("pass");
	By Fbloginbutton=By.name("login");
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpwd).sendKeys(password);
	}
	public void loginclick()
	{
		driver.findElement(Fbloginbutton).click();
	}
	
	
	
			
	

}
