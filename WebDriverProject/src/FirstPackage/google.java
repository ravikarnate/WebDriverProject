package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://ap7am.com");
	}

}
