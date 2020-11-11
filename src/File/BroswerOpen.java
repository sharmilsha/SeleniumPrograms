package File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BroswerOpen {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
		"./src/Mozilla/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.close();
		}	

}
