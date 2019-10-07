package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OuterFrame_to_InnerFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\DriversTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Nahida Islam");
		
	}

}

