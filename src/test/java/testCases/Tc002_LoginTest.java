package testCases;




import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.SocketException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Tc002_LoginTest extends BaseClass  {
@Test(groups={"sanity","Master"})	//all test should be executed contain all test cases 
	public void verify_login() throws SocketException, InterruptedException{
	
	logger.info("***starts tc002logintest***");
	HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
	//property file for login page  	
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		
		lp.clickLogin();
		
	//myaccount page 
		MyAccountPage macc=new MyAccountPage(driver);
		boolean	targetPage=macc.isMyAccountPageExist();
		//the (targetPage, true,"login failed"); targetPage, true compare if it is false it throught "login failed 
		//AssertJUnit.assertEquals(targetPage, true,"login failed");
	logger.info("***finish tc002logintest***");}
}
      