package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundResizeImage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement image = driver.findElement(By.xpath("//img[@class='shadow-1 ui-resizable']"));
        Actions act= new Actions(driver);
        act.clickAndHold(image).moveByOffset(100,0).perform();
        Thread.sleep(3000);
        driver.close();
	}

}
