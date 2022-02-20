package hdfc.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DriverSetup {

	public static WebDriver driver;
	public Properties pro;
	FileInputStream fileInput;
	
	public DriverSetup() throws IOException
	{
		pro = new Properties();
		fileInput = new FileInputStream("C:\\Users\\Bhushan\\eclipse-workspace\\HDFCPOM\\src\\main\\java\\hdfc\\login\\page\\Input.properties");
		pro.load(fileInput);
	}
	
	public void driverIntialize()
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(pro.getProperty("URL"));
		
	}
	
	
	
}
