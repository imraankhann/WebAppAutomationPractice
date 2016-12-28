package pageLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utill.CommonUtil;

import java.util.logging.Logger;

public class CreateAccount_pgLib {
	
	WebDriver driver;
	CommonUtil util;
	static Logger log= Logger.getLogger(CreateAccount_pgLib.class.getName());
	
	/*@FindBy(css="#email_create")
	private WebElement txtBx_createAccEmailAddr;

	@FindBy(css="#SubmitCreate")
	private WebElement btn_CreateAccount;*/

	By emailCreateTxtBx=By.cssSelector("#email_create");

	By createAcctBtn=By.cssSelector("#SubmitCreate");

	By mrRadioBtn= By.cssSelector("#id_gender1");

	By fNameTxtBx=By.cssSelector("#customer_firstname");

	By lNameTxtBx=By.cssSelector("#customer_lastname");

	By pswdTxtBx=By.cssSelector("#passwd");

	By calDaysDrpDwn=By.cssSelector("#days");

	By calMonthsDrpDwn=By.cssSelector("#months");

	By calYearsDrpDwn=By.cssSelector("#years");

	By addrFnameTxtBx=By.cssSelector("#firstname");

	By addrLnameTxtBx=By.cssSelector("#lastname");

	By addrCompanyTxtBx=By.cssSelector("#company");

	By addr1TxtBxx=By.cssSelector("#address1");

	By addr2TxtBx=By.cssSelector("#address2");

	By cityTxtBx=By.cssSelector("#city");

	By stateDrpDwn=By.cssSelector("#id_state");

	By postalcodeTxtBx=By.cssSelector("#postcode");

	By countryTxtBx=By.cssSelector("#id_country");

	By otherTxtBx=By.cssSelector("#other");

	By mobPhnTxtBx=By.cssSelector("#phone_mobile");

	By alliasTxtBx=By.cssSelector("#alias");

	By registerBtn=By.cssSelector("#submitAccount");

	By selectState=By.cssSelector("#id_state");



	public CreateAccount_pgLib(WebDriver driver){
		this.driver=driver;
	}

	public void passEmailToCreateAcct(String email){
		log.info("Passing valid email to create account... ");
		driver.findElement(emailCreateTxtBx).sendKeys(email);
	}

	public void clickCreateAcctBtn(){
		log.info("Clicking on create account button after passing valid email address...");
		driver.findElement(createAcctBtn).click();
	}

	public void selectMrRadioBtn(){
		log.info("Selecting Mr. radion btn...");
		driver.findElement(mrRadioBtn).click();
	}

	public void passCustFirstName(String fName){
		log.info("Passing customers first name in create account page...");
		driver.findElement(fNameTxtBx).sendKeys(fName);
	}
	public void passCustLastName(String lName){
		log.info("Passing customers last name in create account page...");
		driver.findElement(lNameTxtBx).sendKeys(lName);
	}

	public void passPswd(String pswd){
		log.info("Give a valid password...");
		driver.findElement(pswdTxtBx).sendKeys(pswd);
	}

	public void passFnameInAddr(String fNameAddr){
		log.info("Passing F_Name in address section..");
		driver.findElement(addrFnameTxtBx).sendKeys(fNameAddr);
	}

	public void  passLnameInAddr(String lNameAddr){
		log.info("Passing L_Name in address section...");
		driver.findElement(addrLnameTxtBx).sendKeys(lNameAddr);
	}

	public void passCompName(String compName){
		log.info("Passing company name .. ");
		driver.findElement(addrCompanyTxtBx).sendKeys(compName);
	}

	public void passAddr1(String addr1){
		log.info("Passing addr line 1... ");
		driver.findElement(addr1TxtBxx).sendKeys(addr1);
	}

	public void passAddr2(String addr2){
		log.info("Passing addr line 2.. ");
		driver.findElement(addr2TxtBx).sendKeys(addr2);
	}

	public void passCity(String city){
		log.info("Passing city... ");
		driver.findElement(cityTxtBx).sendKeys(city);
	}

	public void passPostalCode(String pincode){
		log.info("Passing postal code.. ");
		driver.findElement(postalcodeTxtBx).sendKeys(pincode);
	}

	public void passCountry(String country){
		log.info("Passing country India.. ");
		driver.findElement(countryTxtBx).sendKeys(country);
	}

	public void passOtherTxt(String other){
		driver.findElement(otherTxtBx).sendKeys(other);
	}

	public void passMobNum(String mobNum){
		log.info("Passing mobile number.. ");
		driver.findElement(mobPhnTxtBx).sendKeys(mobNum);
	}

	public void passAliasTxt(String alliasTxt){
		driver.findElement(alliasTxtBx).sendKeys(alliasTxt);
	}

	public void clickRegisterBtn(){
		log.info("Clicking on Register button... ");
		driver.findElement(registerBtn).click();
	}

	public void selectDayInDrpDwn(String day) throws InterruptedException {
		log.info("selecting day from a drop down ... ");
		driver.findElement(calDaysDrpDwn).click();
		Thread.sleep(2000);
		String day1="//*[@id='days']/option[";
		String day2="]";
		log.info("selecting day from day drop down... ");
		driver.findElement(By.xpath(day1+day+day2)).click();
	}

	public void selectMonthInDrpDwn(String month) throws InterruptedException {
		driver.findElement(calMonthsDrpDwn).click();
		Thread.sleep(2000);
		String month1=".//*[@id='months']/option[";
		String month2="]";
		log.info("selecting month from month drop down.. ");
		driver.findElement(By.xpath(month1+month+month2)).click();
	}

	public void selectYearInDrpDwn(String year) throws InterruptedException {
		driver.findElement(calYearsDrpDwn).click();
		Thread.sleep(2000);
		String year1=".//*[@id='years']/option[";
		String year2="]";
		log.info("selecting year from year drop down.. ");
		driver.findElement(By.xpath(year1+year+year2)).click();
	}

	public void selectAddrState(String state){
		log.info("Selecting state.. ");
		//driver.findElement(selectState).click();
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText(state);

	}

	public void selectByName() throws InterruptedException {
		util.selectByNameMethod((WebElement) selectState);

	}





}
