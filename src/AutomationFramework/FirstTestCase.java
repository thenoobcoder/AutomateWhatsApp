package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
				// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				
		        //Launch the Online Store Website
				driver.get("https://web.whatsapp.com/");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website web.whatsapp.com");
		 
				//Wait for 5 Sec
				Thread.sleep(5);
				
				//check if logged in or not
				if(driver.findElement(By.tagName("div")).findElement(By.className("qrcode idle")) != null){
					System.out.println("Not Logged In!Scan the barcode of your mobile.");
				}
				
				
				
		        // Close the driver
		        driver.quit();
	}

}
