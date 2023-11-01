package com.opencartapplication.Testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.opencartallication.Utillity.UtillPage;

public class TestBasePage {
	
	public static WebDriver driver;
	public  UtillPage excel;
	@BeforeMethod
	public void setUp()
	{
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Default browser");
		}
		
				
		
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		excel=new UtillPage();
	}
	/*
	@AfterMethod
	public void testTear()
	{
		driver.close();
	}*/
}
