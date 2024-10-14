package Testng;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testngdemo {
	@BeforeTest
	public void setup()
	
	{
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemethod url loading");
		
	}
	@org.testng.annotations.Test(groups = {"smoke,sanity"} )
	public void test1()
	{
		System.out.println("test1");
	}
	@org.testng.annotations.Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@org.testng.annotations.Test(groups = {"smoke"})
	public void test3()
	{
		System.out.println("test3");
		
	}
	@org.testng.annotations.Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("test4");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
		
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Aftertest");
	}
	
	}
	


