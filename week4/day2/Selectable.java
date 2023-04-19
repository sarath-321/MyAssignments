package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/selectable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.switchTo().frame(0);
        WebElement txt1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement txt2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
        Actions act= new Actions(driver);
        act.keyDown(Keys.CONTROL).click(txt1).click(txt2).keyUp(Keys.CONTROL).perform();
       
	}
}
