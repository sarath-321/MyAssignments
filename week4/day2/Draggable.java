package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/draggable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.switchTo().frame(0);
        WebElement drag1 = driver.findElement(By.xpath("//p[text()='Drag me around']"));
        Actions act= new Actions(driver);
        act.dragAndDropBy(drag1,100,100).perform();

	}

}
