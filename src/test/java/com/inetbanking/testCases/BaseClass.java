package com.inetbanking.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="http://demo.guru99.com/v4/index.php";
			
	public String username="mngr168479";
	
	public String password="vupemYz";
	
	public String exptitle="Guru99 Bank Manager HomePage";
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		driver=new ChromeDriver();
	}
	
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
}
