package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Result {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DriversTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Nahida");
	
	driver.findElement(By.className("wikipedia-search-button")).click();
	
	
	
	List <WebElement>search_results=driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
	
	System.out.println(search_results.size());
	
	for(WebElement e:search_results)
		
	{
		String link=e.getText();
		
		driver.findElement(By.linkText(link)).click();
	}
	
	Thread.sleep(5000);
	driver.quit();
	
		
	}

	
}
