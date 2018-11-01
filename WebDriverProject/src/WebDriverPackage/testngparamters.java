package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngparamters {

	@Test
	public void yahoologin() {
		
	System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	
	driver.findElement(By.id("login-username")).clear();

	driver.findElement(By.id("login-username")).sendKeys("raviyahoo");

	}
}
