package pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount_pgLib {
	
	WebDriver driver;
	
	@FindBy(css="#email_create")
	private WebElement txtBx_createAccEmailAddr;
	
	@FindBy(css="#SubmitCreate")
	private WebElement btn_CreateAccount;

}
