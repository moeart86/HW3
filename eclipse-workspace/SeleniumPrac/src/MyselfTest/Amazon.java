 package MyselfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*Go to Amazon.com and search for Product 

TEST CASE:
Search for a product in amazon

TEST STEPS
1.Open the Browser using Google Chrome .. pass 
2.Click on the URL box and type the web page "//www.amazon.com/"... failed 
3.After the web page load click on the search box 
4.Type in the search box for a product "Soccer Ball"
5.Click the search button 

TEST DATA 
URL = "https://www.amazon.com/"
SearchText = Soccer Ball*/



public class Amazon {
	
	WebDriver dr;
	
	// open the  browser 
	public void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","/Users/moe/Downloads/chromedriver");// 
		dr = new ChromeDriver(); // get the chrome driver 
		dr.get(url);	// go to url 
		
	}
	// find the elements 
	public void Navi() {
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("soccer ball");// find the search bar and type a product 
		dr.findElement(By.className("nav-input")).click();// click the search button
		dr.findElement(By.className("s-image")).click();// click on the product 
		dr.findElement(By.id("add-to-cart-button")).click();// add to the cart 
		dr.findElement(By.id("hlb-ptc-btn-native")).click();//  Proceed to check out 
		
		
	}
	// to Navigate
	public void navMethod() {
		dr.navigate().back();// go back 
		dr.navigate().back();// go back again 
		dr.navigate().refresh();//refresh the screen 
		
		
	}
	
	// to wait 
	public void myWait(long seconds) throws InterruptedException {
		Thread.sleep(seconds);// wait desirable  seconds 
		
	}
	// to close the browser 
	public void CloseBrowser() throws InterruptedException {
		myWait(5000);// 
		dr.quit();// close the browser 
		}
	
	public static void main(String[] args) throws InterruptedException {// to  call all the method in the main method
		Amazon abc = new Amazon();// creating an object 
		abc.openBrowser("https://www.amazon.com/");
		abc.myWait(5000);
		abc.Navi();
		abc.navMethod();
		abc.myWait(3000);
		abc.CloseBrowser();
	}

}
