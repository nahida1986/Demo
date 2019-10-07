package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12159\\eclipse-workspace\\All_Document\\driver\\IE\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("WebDriver")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click(); 
		
       	}

}