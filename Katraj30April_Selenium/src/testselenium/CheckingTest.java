package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Avdhut Pawar
 * @description
 * @date 26-Jul-2022
 */
public class CheckingTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");  //used to launch URL
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  //Used to launch URL
		Thread.sleep(2000);
		driver.navigate().back();   //use to navigate previous page
		driver.navigate().forward(); // use to navigate forward page
		driver.navigate().refresh(); // use to refresh page
		driver.quit();  //close entire browser
		//driver.close(); // close only current tab

	}
}
