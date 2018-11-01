package WebDriverPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotframe {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		// Download file - to click on save in window popup
		 Robot robotframe = new Robot();
		 robotframe.keyPress(KeyEvent.VK_TAB);
		 robotframe.keyPress(KeyEvent.VK_ENTER);
		    
	    // Upload file - Copy the file path - Paste it in window popup - click on Enter	 
	//	StringSelection stringsel = new StringSelection(data: "C:\\Users\\ravi\\clean.txt");
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel, owner:null);
		
		robotframe.keyPress(KeyEvent.VK_CONTROL);
		robotframe.keyPress(KeyEvent.VK_V);
		
		robotframe.keyRelease(KeyEvent.VK_CONTROL);
		robotframe.keyRelease(KeyEvent.VK_V);
		
		robotframe.keyPress(KeyEvent.VK_ENTER);
		robotframe.keyRelease(KeyEvent.VK_ENTER); 
	}

}
