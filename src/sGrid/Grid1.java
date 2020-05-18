package sGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid1 {
	
	public static WebDriver driver;
	String baseUrl, nodeURL;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		baseUrl = "http://newtours.demoaut.com/";
		nodeURL =" http://192.168.0.100:4455/wd/hub";
		DesiredCapabilities cap  =  new  DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), cap);
	}
       
	@Test
	public void simpleTest()
	{
		driver.get(baseUrl);
		Assert.assertEquals("Welcome:Mercury Tours", driver.getTitle());
	}
	@AfterTest
	public void tearDown()	
	{		
		driver.quit();
	}
	
}
