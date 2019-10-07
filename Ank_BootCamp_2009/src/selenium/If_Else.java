package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class If_Else {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12159\\eclipse-workspace\\All_Document\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement agebox=driver.findElement(By.id("age"));
		String tooltiptext=agebox.getAttribute("title");
		
		System.out.println(tooltiptext);
		
		if(tooltiptext.equals("We for your age only for statistical purposes."))
			
		{
			System.out.println("Tooltip test passed");
		}
		
		else
		{
			System.out.println("Tooltip test Failed");
		}
		driver.quit(); }
		{ System.out.println(" driver not working");

}
}
