package pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;
public class SignIn_pgLib {
	
    WebDriver driver;
    SignIn_pgLib signInPg = PageFactory.initElements(driver,pageLib.SignIn_pgLib.class);

  static Logger log = Logger.getLogger(SignIn_pgLib.class.getName());
	
	@FindBy(css=".login")
	private WebElement lnk_SignInLink;
	
	@FindBy(css="#email")
	private WebElement txtBx_EmailAddrr;
	
    @FindBy(css="#passwd")
    private WebElement txtBx_Psswd;
    
    @FindBy(css=".lost_password.form-group >a")
    private WebElement lnk_forgotPswd;
    
    @FindBy(css="#SubmitLogin")
    private WebElement btn_SignIn;

    public SignIn_pgLib(WebDriver driver){
    	this.driver=driver;
    }


    
    public void clkSignInInhmePg(){
    	log.info("Clicking on signin link in home page header....");
    	lnk_SignInLink.click();
    }
    
    public void passEmailInSignIn(String email){
    	
    	log.info("passing email address in sign in page to sign in...");
    	txtBx_EmailAddrr.sendKeys(email);
    }
    
    public void passPswdInSignIn(String psswd)
    {
    	log.info("passing password in sign in page to sign in ... ");
    	txtBx_Psswd.sendKeys(psswd);
    }
    
    public void clkForgtPswdLink(){
    	log.info("Clicking forgot password link.... ");
    	lnk_forgotPswd.click();
    }
    
    public void clkSignBtn(){
    	log.info("Clicking on sign in button after passing email and password...");
    	btn_SignIn.click();
    }
}
