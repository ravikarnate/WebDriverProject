package WebDriverPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//1- get the count of links in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2--get the count of links in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3--Only first column Links count of footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4-- Click on each link in the column and check if the page are opening.
		for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
          {
			//to open the link in another tab
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			//columndriver.findElements(By.tagName("a")).get(i).click();
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(4000);
          }
			// get all the opened windows
			Set<String> abc= driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
          
	}

}














