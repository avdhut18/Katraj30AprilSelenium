package checkboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();

		Thread.sleep(1000);
		WebElement checkBox = driver.findElement(By.xpath(
				"//*[text()='Desktop']//parent::label//parent::span//span//*[@class='rct-icon rct-icon-uncheck']"));

		checkBox.click();
		WebElement checkBox1 = driver.findElement(By.xpath(
				"//*[text()='Desktop']//parent::label//parent::span//span//*[@class='rct-icon rct-icon-check']"));
		
		Thread.sleep(1000);
		String attValue = checkBox1.getAttribute("class");
		if(attValue.contains("-check"))
			System.out.println("checkbox is selcted");
		else
			System.out.println("check is not selected");
	}
}
