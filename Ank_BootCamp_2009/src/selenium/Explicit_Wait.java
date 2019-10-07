package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12159\\eclipse-workspace\\All_Document\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
WebDriverWait mywait=new WebDriverWait(driver,2000);
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		username.sendKeys("mercury");
		
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}

