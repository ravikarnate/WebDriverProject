package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging02.hcmondemand.net/home");
		
		driver.findElement(By.name("ctl00$DefaultContent$TxtEmailAddress")).sendKeys("1lucas@hcmondemand.net");
		driver.findElement(By.name("ctl00$DefaultContent$TxtPassword")).sendKeys("QA$@123");
		
		driver.findElement(By.id("DefaultContent_btnLog")).click();
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@class='gn-opener gn-icon gn-icon-menu']")).click();
		
		WebElement menu = driver.findElement(By.xpath("//a[@class='gn-opener gn-icon gn-icon-menu']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).build().perform();
		
		
	}

}
