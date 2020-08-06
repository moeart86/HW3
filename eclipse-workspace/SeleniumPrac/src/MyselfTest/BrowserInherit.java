package MyselfTest;

public class BrowserInherit extends Browser {

	public static void main(String[] args) throws InterruptedException {
		BrowserInherit cc = new BrowserInherit();
			cc.openBrowser("https://www.amazon.com/");
			cc.Navi();
			cc.verifytitle();
			cc.getCurrentUrl();
			cc.myWait(3000);
			cc.CloseBrowser();
		
	}

		


	}
