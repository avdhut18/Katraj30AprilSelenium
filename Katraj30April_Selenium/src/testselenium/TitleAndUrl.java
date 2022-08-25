package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();  //used to get webpage title
		String url = driver.getCurrentUrl(); //used to get current URL 
		System.out.println(title);
		System.out.println(url);
		
		WebElement txtToVerify = driver.findElement(By.xpath("//*[contains(text(),'Panel')]"));
		String txt = txtToVerify.getText();
		System.out.println(txt);
		
		
		WebElement userName = driver.findElement(By.xpath("//input[contains(@name,'Usernam')]"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		Thread.sleep(2000);
		driver.close();
	}
}
