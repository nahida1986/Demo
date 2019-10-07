package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_AlertBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DriversTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		

		

	}

}

