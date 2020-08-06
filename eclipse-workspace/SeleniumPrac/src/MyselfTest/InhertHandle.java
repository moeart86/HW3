package MyselfTest;

public class InhertHandle extends Handle {
	static InhertHandle hn = new InhertHandle();
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//hn.radioButton();
		//hn.droppDown();
		//hn.upnDown();
		//hn.checkBoxes();
		//hn.wait(2000);
			hn.alert();
			
		

		}

	
	public void radioButton () throws InterruptedException {
		//InhertHandle hncd = new InhertHandle();
		hn.openBrowser("https://www.amazon.com/");
		hn.radioButtons();
		hn.closeBrowser();	 
	}
	
	public void droppDown() throws InterruptedException {
		//InhertHandle hnc = new InhertHandle();
		hn.openBrowser("https://www.amazon.com/");
		hn.radioButtons();
		hn.dropDown();
		hn.closeBrowser();	
	}

	public void upnDown() {
		//InhertHandle hn = new InhertHandle();
		hn.openBrowser("https://www.testandquiz.com/selenium/testing.html");
		hn.scroll();
		hn.closeBrowser();		
	}

	public void checkBoxess () {
		//InhertHandle aa = new InhertHandle();
		hn.openBrowser("https://www.testandquiz.com/selenium/testing.html");
		hn.checkBoxes();
		hn.closeBrowser();	
	}
	public void alert() throws InterruptedException {
		//InhertHandle bb = new InhertHandle();
		hn.openBrowser("https://www.testandquiz.com/selenium/testing.html");
		hn.wait(3000);
		hn.scroll();
		hn.wait(3000);
		hn.handleAlert();
		hn.wait(3000);
		hn.closeBrowser();	
			
	}





}




