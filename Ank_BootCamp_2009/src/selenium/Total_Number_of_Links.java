package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Number_of_Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12159\\eclipse-workspace\\All_Document\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
       // driver.manage().window().maximize();

		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		System.out.println(links.getClass());
		
//		for(WebElement e:links)
//		{
//			System.out.println(e.getText());
//			
//		}


	}

}
