package hdfc.login.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hdfc.login.page.LoanInformationPage;
import hdfc.main.DriverSetup;
import hdfc.utilities.HdfcScroll;

public class LoanInformationTest extends DriverSetup {
	
	LoginTest login_tests;
	HdfcScroll scroll;
	LoanInformationPage loan_page;
	
	public LoanInformationTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void loanSetUp() throws IOException
	{
		login_tests = new LoginTest();
		login_tests.loginSetUp();
		login_tests.getAppTitle();
		scroll = new HdfcScroll();
		loan_page = new LoanInformationPage();
	}
	
	@Test
	public void consent()
	{
		loan_page.dashboard();
		scroll.scrollPage();
		loan_page.acceptConsent();
		
		loan_page.loanType();
		loan_page.loanAmount(pro.getProperty("LoanAmount"));
		loan_page.loanTenure(pro.getProperty("LoanTenure"));
		loan_page.interestRate(pro.getProperty("InterestRate"));
		loan_page.balanceTransfer(pro.getProperty("BT"));
		scroll.scrollPage();
		loan_page.backOrNext();
	}
	
}
