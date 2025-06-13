package pageimplementations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.openbrowserpage;

public class openbrowserimpl implements  openbrowserpage{
	
	 WebDriver driver;

	 public openbrowserimpl(WebDriver driver) {
		 this.driver=driver;
	 }
		public WebDriver openBrowser(WebDriver driver) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		return (WebDriver) driver;
		
	}}