package week7.day1.waitsassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChange {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		WebElement waitVisible = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		wait.until(ExpectedConditions.visibilityOf(waitVisible));
		driver.close();
		

	}

}
