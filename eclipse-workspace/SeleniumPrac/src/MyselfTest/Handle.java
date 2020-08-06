package MyselfTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle {

	
	WebDriver dr;
	
	public void openBrowser (String url ) {
		System.setProperty("webdriver.chrome.driver","/Users/moe/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get(url);
		
	}
	public void radioButtons () throws InterruptedException {
		WebElement lang = dr.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		lang.click();
		wait(2000);
		WebElement opt = dr.findElement(By.xpath("//div[2]//div[1]//label[1]//i[1]"));
		opt.click();
		wait(2000);
		WebElement Cancel = dr.findElement(By.linkText("Cancelar"));
		Cancel.click();	
		
	}
	public void dropDown() {
		WebElement dropdown = dr.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(23);
		
	}
	public void scroll() {
		
		JavascriptExecutor sc = (JavascriptExecutor)dr;
		sc.executeScript("scrollBy(0 , 2000)");
					}
	
	public void checkBoxes () {
		
	WebElement checkBoxes = dr.findElement(By.xpath("//input[@class='Automation']"));
	checkBoxes.click();
	WebElement option2 = dr.findElement(By.xpath("//input[@class='Performance']"));
	option2.click();
	}
	
	
	public void handleAlert() {
		WebElement Alert = dr.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]"));
		Alert.click();
		dr.switchTo().alert().accept();
			
		
	}
		

     public void wait (int x) throws InterruptedException {
	Thread.sleep(x);
	
		
	}
	
	
public void closeBrowser () {
	
	dr.quit();
		
		
	}
	
	
}
