package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDraggable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
        Actions act= new Actions(driver);
        Thread.sleep(2000);
        act.dragAndDropBy(drag,200,0).perform();
        Thread.sleep(3000);
        driver.close();

	}

}
