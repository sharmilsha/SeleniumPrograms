package File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./src/Mozilla/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		boolean
		logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/img")).isDisplayed();
		if(logo==true)
		{
		System.out.println("logo is available");
		}
		else{
		System.out.println("logo is not available");
		}
		}


}
