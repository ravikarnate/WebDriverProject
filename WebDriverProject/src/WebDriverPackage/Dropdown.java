package WebDriverPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	Thread.sleep(20000);
		driver.get("https://book.spicejet.com/");
		driver.close();*/
		
		//----Static dropdowns
	//Select s = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
	//s.selectByVisibleText("USD");
	//driver.findElement(By.id("divpaxinfo")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.id("hrefIncAdt")).click();
	//driver.findElement(By.id("btnclosepaxoption")).click();	
	
	//---Dynamic dropdown	
	//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	//driver.findElement(By.xpath("//a[@value='GOI']")).click();
	//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	
		//---Validate whether Checkbox is selected or not
		//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());		
		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());		

		// --- Implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// --- Explicit wait
		//WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.invisibilityOfElementLocated(By.id("")));		
		
		// --- Actions
		//Actions a = new Actions(driver);
		//WebElement move = driver.findElement(By.id("ad"));
		//**MouseHover
		//a.moveToElement(driver.findElement(By.id("ad"))).build().perform();
		//**Caps
		//a.moveToElement(driver.findElement(By.id("ad"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//**Double click
		//a.moveToElement(driver.findElement(By.id("ad"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//**Right click
		//a.moveToElement(move).contextClick().build().perform();
		//** drag & drop
		
		
		/*Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/home/ravindranath/Downloads/Screenshot/screenshot.png"));
		driver.close();*/
		
	driver.manage().deleteAllCookies();
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











