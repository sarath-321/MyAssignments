package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.switchTo().frame(0);
        WebElement dragSource = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement dropTarget = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions act= new Actions(driver);
        act.dragAndDrop(dragSource, dropTarget).perform();
       
	}
}
