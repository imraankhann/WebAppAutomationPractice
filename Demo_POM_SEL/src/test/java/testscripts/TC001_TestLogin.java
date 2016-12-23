package testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.main.java.pageLib.SignIn_pgLib;
import src.main.java.utill.CommonUtil;
import src.test.java.testBase.TestBase;

import testBase.TestBase;

import java.io.IOException;

public class TC001_TestLogin extends TestBase {
	
	SignIn_pgLib signInPg;
	CommonUtil commonUtil;

	@BeforeClass
	public void setup() throws IOException {
		init();
		
	}
	
	@Test
	public void testLogin() throws InterruptedException {

       // SignIn_pgLib signInPg = PageFactory.initElements(driver,pageLib.SignIn_pgLib.class);

		signInPg=new SignIn_pgLib(driver);
//		commonUtil.wait(20);
		signInPg.clkSignInInhmePg();
//		commonUtil.wait(20);
		signInPg.passEmailInSignIn("test@practice.com");
//		commonUtil.wait(10);
		signInPg.passPswdInSignIn("123456");
//		commonUtil.wait(10);
		signInPg.clkSignBtn();
	}

}
