package MyselfTest;


public class callMethod extends Amazon {


	
	public static void main(String[] args) throws InterruptedException {
		
	
		callMethod Ab = new callMethod();
		
		Ab.openBrowser("https://www.amazon.com/");
		Ab.Navi();
		Ab.navMethod();
		Ab.myWait(3000);
		Ab.CloseBrowser();
		
		
		
		
	}
	
	

	
	

}
