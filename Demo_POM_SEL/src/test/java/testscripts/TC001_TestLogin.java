package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageLib.SignIn_pgLib;
import testBase.TestBase;
import utill.CommonUtil;

import java.io.IOException;

public class TC001_TestLogin extends TestBase {
	
	SignIn_pgLib signInPg;
	CommonUtil commonUtil;

	@BeforeClass
	public void setup() throws IOException {
		init();
		
	}
	
	@Test
	public void testInvalidLogin() throws InterruptedException {

       // SignIn_pgLib signInPg = PageFactory.initElements(driver,pageLib.SignIn_pgLib.class);

		signInPg=new SignIn_pgLib(driver);
		commonUtil.implicitWait(20);
		signInPg.clkSignInInhmePg();
		commonUtil.implicitWait(20);
		signInPg.passEmailInSignIn("test@practice.com");
		commonUtil.implicitWait(10);
		signInPg.passPswdInSignIn("123456");
		commonUtil.implicitWait(20);
		signInPg.clkSignBtn();
		Assert.assertEquals(signInPg.getAuthenticationFailMsgForSignIn(),"Authentication failed.");
	}

	@AfterClass
	public void closeBrowser(){
		driver.close();
		driver.quit();

	}

}
