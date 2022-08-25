package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();   //Simple Alert
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();  //Confirmation Alert
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Avdhut");  //Prompt Alert
		driver.switchTo().alert().accept();
	}
}
