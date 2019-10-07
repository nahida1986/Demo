package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://DriversTest1//chromedriver_win32//chromedeiver76.exe//chromedriver_win32 (1)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://api.jquery.com/dblclick/");
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("/html/body/div"));
		Thread.sleep(5000);
	//	Actions act=new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		
		
		

	}

}
