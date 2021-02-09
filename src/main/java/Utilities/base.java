package Utilities;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	public WebDriver initializeDriver(String browserName, String URL) 
	{
			if(browserName.equals("CR"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradnyap\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			driver.navigate().to(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
	}

}
