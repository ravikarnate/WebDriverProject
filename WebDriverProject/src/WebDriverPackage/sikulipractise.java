package WebDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikulipractise {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		Pattern image1 = new Pattern("/home/ravindranath/Pictures/Mail.png");
		Pattern image2 = new Pattern("/home/ravindranath/Pictures/Email.png");
		Pattern image3 = new Pattern("/home/ravindranath/Pictures/Next.png"); 
		
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//screen.wait(image1, 10);
		screen.click(image1);
		screen.type(image2, "ravi@gmail.com");
		screen.click(image3);
		
	}

}
