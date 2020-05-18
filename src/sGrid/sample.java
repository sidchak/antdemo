package sGrid;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample {
	
	@Test
	public void Sjemeter() 
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sid\\Desktop\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");				

		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
