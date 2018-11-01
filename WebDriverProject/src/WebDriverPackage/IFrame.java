package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dream11.com/tf/cricket#login");
	}
	
	// Passing WebDriver argument to use WebDriver methods
	public void frames(WebDriver driver)
	{
		int framecount = driver.findElements(By.tagName("iframe")).size();		
		for(int i=0; i<framecount; i++)
		{
			driver.switchTo().frame(i);
		}
		
		// This gets back the normal web page from Frame
		driver.switchTo().defaultContent();
	}

}
