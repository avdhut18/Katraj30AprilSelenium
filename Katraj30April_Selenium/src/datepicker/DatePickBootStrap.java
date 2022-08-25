package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickBootStrap {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(1000);
		
		int i = 0;
		while(i==0) {
			String text = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			if(!(text.equals("June 1993")))
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			else
				break;
			
		}
		
		driver.findElement(By.xpath("//a[text()='18']")).click();
	}
}
