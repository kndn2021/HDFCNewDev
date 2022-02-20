package hdfc.utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import hdfc.main.DriverSetup;

public class HdfcScroll extends DriverSetup {

	JavascriptExecutor ex;
	
	public HdfcScroll() throws IOException
	{
		ex = (JavascriptExecutor)driver;
	}
	
	public void scrollPage()
	{
		ex.executeScript("window.scrollBy(0,500)");
	}
	
}
