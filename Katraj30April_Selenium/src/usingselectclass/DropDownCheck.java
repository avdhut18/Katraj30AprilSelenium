package usingselectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#signup-button input")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selMonth = new Select(month);
		selMonth.selectByValue("6");
		
		Select selDay = new Select(day);
		selDay.selectByIndex(18);
		
		
		Select selYear = new Select(year);
		selYear.selectByVisibleText("1993");
	}
}
