package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDraggableRows {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement source = driver.findElement(By.xpath("(//td[text()='Galaxy Earrings'])[2]"));
        WebElement target = driver.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
        Actions act= new Actions(driver);
        act.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
        driver.close();

	}

}
