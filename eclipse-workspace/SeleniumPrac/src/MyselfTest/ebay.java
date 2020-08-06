package MyselfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
	
		
		WebDriver dr;
	
		public void openBrowser(String url) {
			System.setProperty("webdriver.chrome.driver","/Users/moe/Downloads/chromedriver");// 
			dr = new ChromeDriver(); // get the chrome driver 
			dr.get(url);	// go to url 
		}
				
		public void sendKeys () {
				
		dr.findElement(By.className("\"gh-tb ui-autocomplete-input\"")).sendKeys("men levi's jeans");
						
			}
		public void click () {
					
						
			}
		
		public void myWait(long seconds) throws InterruptedException {
			Thread.sleep(seconds);
			
		}

		public void CloseBrowser() throws InterruptedException {
			myWait(3000);// 
			dr.quit();// close the browser 
			}
				
		public static void main(String[] args) throws InterruptedException {
		
			ebay abc = new ebay();
			abc.openBrowser("https://www.ebay.com/");
			abc.sendKeys();
			abc.click();
			abc.myWait(3000);
			abc.CloseBrowser();
	
		
		
	}

}
