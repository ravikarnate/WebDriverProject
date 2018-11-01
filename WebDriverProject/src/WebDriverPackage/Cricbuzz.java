package WebDriverPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18884/eng-vs-ind-2nd-test-india-tour-of-england-2018");
		
	    WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	   // System.out.println(rowcount);
	    
	    for(int i=0; i<rowcount-2; i++)
	    {
	    	//string count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i);
	    	String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();	
	    	int valueinteger = Integer.parseInt(value);
	    	sum=sum+valueinteger;
	    }
	   // System.out.println(sum);
	    String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	    int extrasvalue = Integer.parseInt(Extras);
	    int TotalScore = sum+extrasvalue;
	    System.out.println(TotalScore);
	    String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	    int ActualTotalValue = Integer.parseInt(ActualTotal);
	    
	    if(ActualTotalValue==TotalScore)
	    {
	    	System.out.println("Count matches");
	    }
	   
	}

}
