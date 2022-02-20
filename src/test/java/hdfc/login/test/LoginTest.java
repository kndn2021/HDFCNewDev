package hdfc.login.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hdfc.login.page.LoginPage;
import hdfc.main.DriverSetup;
import hdfc.utilities.HdfcScroll;
import hdfc.utilities.OTPInput;

public class LoginTest extends DriverSetup {

	DriverSetup login_setup;
	LoginPage login_page;
	OTPInput otp_input;
	HdfcScroll scroll;
	
	public LoginTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void loginSetUp() throws IOException
	{
		login_setup = new DriverSetup();
		login_setup.driverIntialize();
		login_page = new LoginPage();
		otp_input = new OTPInput();
		scroll = new HdfcScroll();
	}
	
	@Test
	public void getAppTitle()
	{
		login_page.loginPage();
		String otp = otp_input.otpInput();
		scroll.scrollPage();
		login_page.verifyOTP(otp);
	}
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.close();
//	}
	
}
