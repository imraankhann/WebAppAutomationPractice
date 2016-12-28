package testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageLib.CreateAccount_pgLib;
import pageLib.SignIn_pgLib;
import testBase.TestBase;
import utill.CommonUtil;

import java.io.IOException;

/**
 * Created by 12045 on 26/12/16.
 */
public class TC002_TestCreateAccount extends TestBase{

    CreateAccount_pgLib createaccount_pglib;
    SignIn_pgLib signin_pglib;
    CommonUtil commonutill;

    @BeforeClass
    public void setup() throws IOException {
        init();

    }

    @Test
    public void createAccountInvalid() throws InterruptedException {
        signin_pglib=new SignIn_pgLib(driver);
        createaccount_pglib=new CreateAccount_pgLib(driver);
        signin_pglib.clkSignInInhmePg();
        commonutill.implicitWait(15);
        Thread.sleep(2000);
        createaccount_pglib.passEmailToCreateAcct("abcTest005@gmail.com");
        commonutill.implicitWait(20);
        createaccount_pglib.clickCreateAcctBtn();
        Thread.sleep(1000);
        commonutill.implicitWait(20);
       // createaccount_pglib.selectMrRadioBtn();
        Thread.sleep(1000);
        createaccount_pglib.passCustFirstName("test");
        createaccount_pglib.passCustLastName("everything");
        createaccount_pglib.passPswd("123456");

        commonutill.implicitWait(20);
        Thread.sleep(2000);
        createaccount_pglib.selectDayInDrpDwn("5");
        commonutill.implicitWait(20);
        createaccount_pglib.selectMonthInDrpDwn("5");
        commonutill.implicitWait(20);
        createaccount_pglib.selectYearInDrpDwn("3");
        createaccount_pglib.passFnameInAddr("First name addr");
        createaccount_pglib.passLnameInAddr("last name addr");
        createaccount_pglib.passCompName("Testing QA");
        createaccount_pglib.passAddr1("Address 1 ");
        createaccount_pglib.passAddr2("Address 2");
        createaccount_pglib.passCity("Bengaluru");
        createaccount_pglib.selectAddrState("Arizona");
        Thread.sleep(2000);


    }

    /*@AfterClass
    public void closeBrowser(){

        driver.quit();
        driver.close();
    }*/
}
