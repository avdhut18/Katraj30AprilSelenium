package checkboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioVerify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();

		
		boolean check= driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isDisplayed();
		driver.findElements(By.cssSelector("table.p td input#sex")).get(0).click();
		boolean check1=driver.findElements(By.cssSelector("table.p td input#sex")).get(0).isDisplayed();
	System.out.println(check);  //true
	System.out.println(check1); //true
	
	
	}
}