package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12159\\eclipse-workspace\\All_Document\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		WebElement source_element=driver.findElement(By.id("box1"));
		WebElement target_element=driver.findElement(By.id("box101"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(source_element, target_element).build().perform();
		
        WebElement source_element1=driver.findElement(By.id("box2"));
		
		WebElement target_element1=driver.findElement(By.id("box102"));
		
		Actions act1=new Actions(driver);
		Thread.sleep(3000);
		
		act1.dragAndDrop(source_element1, target_element1).build().perform();
		
		
		
WebElement source_element11=driver.findElement(By.id("box3"));
		
		WebElement target_element11=driver.findElement(By.id("box103"));
		
		Actions act11=new Actions(driver);
		Thread.sleep(3000);
		
		act11.dragAndDrop(source_element11, target_element11).build().perform();
WebElement source_element111=driver.findElement(By.id("box4"));
		
		WebElement target_element111=driver.findElement(By.id("box104"));
		
		Actions act111=new Actions(driver);
		Thread.sleep(3000);
		
		act111.dragAndDrop(source_element111, target_element111).build().perform();
WebElement source_element1111=driver.findElement(By.id("box5"));
		
		WebElement target_element1111=driver.findElement(By.id("box105"));
		
		Actions act1111=new Actions(driver);
		Thread.sleep(3000);
		
		act1111.dragAndDrop(source_element1111, target_element1111).build().perform();
WebElement source_element2=driver.findElement(By.id("box6"));
		
		WebElement target_element2=driver.findElement(By.id("box106"));
		
		Actions act2=new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(source_element2, target_element2).build().perform();
WebElement source_element3=driver.findElement(By.id("box7"));
		
		WebElement target_element3=driver.findElement(By.id("box107"));
		
		Actions act3=new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(source_element3, target_element3).build().perform();
		
		
		
		

	}

}
