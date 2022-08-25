package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

		WebElement iframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe); // go within iframe
		boolean testCase = driver.findElement(By.id("sampleHeading")).getText().equals("This is a sample page");
		System.out.println(testCase);
	}
}
