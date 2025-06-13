package pageimplementations;
import org.openqa.selenium.WebDriver;

import pages.closebrowserpage;


public class closebrowserimpl implements  closebrowserpage{
	
	WebDriver driver;
	
	
	public closebrowserimpl(WebDriver driver){
		this.driver =driver;
	}

		public void closeBrowser(WebDriver driver) {
		driver.close();
		driver.quit();
	}}