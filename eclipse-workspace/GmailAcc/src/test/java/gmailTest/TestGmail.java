package gmailTest;

import org.testng.annotations.Test;

import gmailVerify.Gmail;

public class TestGmail {
	
	@Test
	public void testGmail() {
	
	
	Gmail abc = new Gmail();
	abc.openBroser();
	abc.verifyPageTitle();
	abc.verifyUrl();
	abc.userName();
	abc.passWord();
	abc.signIn();
	abc.verifySignIn();
	abc.closeBrowser();
	
	
	

}
}