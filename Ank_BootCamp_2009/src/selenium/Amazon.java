package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DriversTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("nahidaislamnimi69@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("nahida1234");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tie for men ");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[27]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.xpath("(//i[@class='hm-icon nav-sprite'])")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[contains(text(),'Sign Out')]")).click();
		
		
	   
	   

	}}
