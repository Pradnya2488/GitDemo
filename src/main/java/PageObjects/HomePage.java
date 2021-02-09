package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class HomePage{
	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	public WebDriver driver;
	By alertbutton=By.id("alertbtn");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement clickAlertButton()
	{
		return driver.findElement(alertbutton);
	}
	public String validateAlertBox()
	{
		return driver.switchTo().alert().getText();
	}

}
