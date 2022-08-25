package multiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		String winId1 = driver.getWindowHandle(); // this will give current window id where driver is present
		System.out.println("Primary window Id: " + winId1);

		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allWindowId = driver.getWindowHandles(); // this will give windowid of all the screens that are open
																// currently
		for (String eachWinId : allWindowId) {
			driver.switchTo().window(eachWinId);
			if(driver.getTitle().contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				Thread.sleep(500);
				driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
				Thread.sleep(500);
				driver.findElement(By.id("Form_submitForm_FullName")).sendKeys("Avdhut");
			}
		}

		driver.switchTo().window(winId1);
		driver.findElement(By.id("txtUsername")).sendKeys("Avdhut");
		driver.close();
	}
}

//

//

