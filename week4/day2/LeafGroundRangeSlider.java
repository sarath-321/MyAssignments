package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundRangeSlider {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act= new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        WebElement left = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        WebElement right = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        act.dragAndDropBy(left, 50, 0).perform();
        Thread.sleep(2000);
        act.dragAndDropBy(right, -30, 0).perform();
        Thread.sleep(3000);
        driver.close();
        
        
        
        

	}

}
