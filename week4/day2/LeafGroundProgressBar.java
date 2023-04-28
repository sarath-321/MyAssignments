package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LeafGroundProgressBar {

    static String str="100%";
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/drag.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act= new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Start']")).click();
        Thread.sleep(40000);
        String text = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
        System.out.println("Progress status :"+text);
        if(text.contains(str)) {
        	System.out.println("Completed!");
        }
        else {
        	System.out.println("Not completed!");
        }
        Thread.sleep(3000);
        driver.close();

	}

}
