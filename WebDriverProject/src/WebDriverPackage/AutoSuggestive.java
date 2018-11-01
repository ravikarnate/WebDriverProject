package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		// Java script DOM can extract hidden elements
		// Because Selenium cannot identify hidden elements-(Ajax implementation)
		// Investigate the properties of object, if it have any hidden text
		// Java script executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"));
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				//break;
			}
			
		}
	}

}
