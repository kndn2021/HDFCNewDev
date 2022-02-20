package hdfc.login.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hdfc.main.DriverSetup;

public class LoginPage extends DriverSetup {

	@FindBy(how = How.ID, using = "b8-Input_MobileNumber")
	WebElement email_id;
	
	@FindBy(id = "b8-Input_TextVar")
	WebElement pan;
	
	@FindBy(xpath = "//button[@class='verify-otp OSFillParent']")
	WebElement login_button;
	
	@FindBy(id = "b8-b3-Input_OTP1")
	WebElement enter_otp;
	
	@FindBy(xpath = "//span[text()='Verify OTP']")
	WebElement verify_otp;
	
	@FindBy(xpath = "//span[text()='LOGIN']")
	WebElement login;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);		
	}
	
	public void loginPage()
	{
		email_id.sendKeys(pro.getProperty("Email"));
		pan.sendKeys(pro.getProperty("PAN"));
		login_button.click();
	}
	
	public void verifyOTP(String getOTP)
	{
		enter_otp.sendKeys(getOTP);
		verify_otp.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.click();
	}
}
