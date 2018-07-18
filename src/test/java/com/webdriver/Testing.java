package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Testing
{
	@Parameters("browser")
	@Test
	public void testLogin(String value)
	{
		WebDriver driver=null;
		if(value.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			else if(value.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.21.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else
			{
				System.out.println("No driver found");
			}
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("ShilpaKumareshan");
	driver.findElement(By.id("password")).sendKeys("Testing123");
	driver.findElement(By.name("commit")).click();
	String Title=driver.getTitle();
	System.out.println(Title);
	System.out.println("test");
	
	}
}
