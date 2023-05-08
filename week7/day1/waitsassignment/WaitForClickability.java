package week7.day1.waitsassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForClickability {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.leafground.com/waits.xhtml");
		WebElement element = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		//element.click();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Click Second']"));
		//driver.executeScript("arguments[0].click();", element1);
		//element1.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(element1));
		//driver.close();
	

	}

}
