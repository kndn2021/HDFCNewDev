package hdfc.login.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hdfc.main.DriverSetup;

public class LoanInformationPage extends DriverSetup {

	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Accept']")
	WebElement consent_letter;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Create New']")
	WebElement create_new;
	
	@FindBy(id = "b6-$b2")
	WebElement loan_type;
	
	@FindBy(id = "b6-Input_TextVar2")
	WebElement loan_amount;
	
	@FindBy(id = "b6-Input_Tenure")
	WebElement loan_tenure;
	
	@FindBy(xpath = "//span[text()='Floating']")
	WebElement interest_rate_floating;
	
	@FindBy(xpath = "//span[text()='2 Years Fixed']")
	WebElement interest_rate_fixed;
	
	@FindBy(xpath = "//div[text()='Yes']")
	WebElement bt_yes;
	
	@FindBy(xpath = "//div[text()='No']")
	WebElement bt_no;
	
	@FindBy(id = "b5-b7-SVG")
	WebElement loan_next;

	public LoanInformationPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dashboard()
	{
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(create_new));
		create_new.click();
	}
	
	public void acceptConsent()
	{
		consent_letter.click();
	}
	
	public void loanType()
	{
		loan_type.click();
	}
	
	public void loanAmount(String loanamount)
	{
		loan_amount.sendKeys(loanamount);
	}
	
	public void loanTenure(String loantenure)
	{
		loan_tenure.sendKeys(loantenure);
	}
	
	public void interestRate(String interestrate)
	{
		if(interestrate.equalsIgnoreCase("Floating"))
		{
			interest_rate_floating.click();
		}
		else if(interestrate.equalsIgnoreCase("Fixed"))
		{
			interest_rate_fixed.click();	
		}
		else
		{
			System.out.println("Interest rate is not selected");
		}
	}
	
	public void balanceTransfer(String balancetransfer)
	{
		if(balancetransfer.equalsIgnoreCase("Yes"))
		{
			bt_yes.click();
		}
		else if(balancetransfer.equalsIgnoreCase("No"))
		{
			bt_no.click();
		}
		else
		{
			System.out.println("BT loan is not selected");
		}
	}
	
	public void backOrNext()
	{
		loan_next.click();
	}
}
