package MyselfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
WebDriver dr;
//String expectedTitle =
String actualTitle = null;


	
	public void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","/Users/moe/Downloads/chromedriver");// 
		dr = new ChromeDriver(); 
		dr.get(url);
		
	}
	public void Navi() {
		WebElement search = dr.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("soccer ball");
		search.clear();
		WebElement searchBox = dr.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("soccer ball");
		WebElement searchBox1 = dr.findElement(By.className("nav-input"));
		searchBox1.click();
		
	}
	public void verifytitle() {
	  actualTitle = dr.getTitle();
		System.out.println(actualTitle);
		
	}
	public void getCurrentUrl() {
		 String actualUrl = dr.getCurrentUrl();
		 System.out.println(actualUrl);
		}
	

	public void myWait(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
		
	}
	
	public void CloseBrowser() throws InterruptedException {
		myWait(5000);// 
		dr.quit();
		dr.close();
		}
}

