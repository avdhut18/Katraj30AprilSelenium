package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSS {
	
	static WebDriver driver;
	public void screenShotss() throws IOException {
		TakesScreenshot scrnShot = (TakesScreenshot)driver;
		File source = scrnShot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\avdhu\\OneDrive\\Pictures\\SSViman\\April30ScreenShot.png");
		FileHandler.copy(source, destination);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		TakingSS ss = new TakingSS();
		ss.screenShotss();
		Thread.sleep(1000);
		driver.quit();
		
	}
}
