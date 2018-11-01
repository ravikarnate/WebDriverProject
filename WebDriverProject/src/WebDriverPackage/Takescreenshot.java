package WebDriverPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty(driver, value)
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18884/eng-vs-ind-2nd-test-india-tour-of-england-2018");
		driver.navigate().to("https://google.com");
		Thread.sleep(2000);
		System.out.println("Starting");
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Ending");

		try {
			 // now copy the  screenshot to desired location using copyFile //method
		//	FileUtils.copyFile(src, new File("/home/ravindranath/Downloads/NA-Production/screenshot3.png"));
			}
			 
			catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 }
			 }


	}

}
