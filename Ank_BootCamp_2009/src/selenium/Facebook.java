package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DriversTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("2159348398");
        driver.findElement(By.id("pass")).sendKeys("nimi1986");
        driver.findElement(By.id("u_0_2")).click();
        
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='findFriendsNav']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("islam nimi");
        driver.findElement(By.xpath("//i[@class='_585_']")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Messenger']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
         Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[text()='News Feed']")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Watch') and @dir]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'Account Setting')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        
       

       
        
        
        
	}

}
