package marathon1.testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(option);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.get("https://in.bookmyshow.com/");
		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("Hyderabad");
		cd.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
		System.out.println(cd.getCurrentUrl());
		cd.findElement(By.id("4")).click();
		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("DASARA");
		cd.findElement(By.xpath("//strong[text()='Dasara']")).click();
		cd.findElement(By.xpath("//span[text()='Book tickets']")).click();
		cd.findElement(By.xpath("//span[text()='2D']")).click();
		System.out.println(cd.findElement(By.xpath("//a[text()='Aarti Theater: Sanginagar']")).getText());
		cd.findElement(By.xpath("(//div/div[text()='INFO'])[1]")).click();
		System.out.println(cd.findElement(By.xpath("(//div[@class='facility-text'])[2]")).getText());
		cd.findElement(By.className("cross-container")).click();
		cd.findElement(By.xpath("//a[@data-venue-code='ARTI']")).click();
		cd.findElement(By.xpath("//li[text()='1']")).click();
		cd.findElement(By.id("proceed-Qty")).click();
		cd.findElement(By.id("A_7_10")).click();
		cd.findElement(By.id("btmcntbook")).click();
		System.out.println("Sub Total :"+cd.findElement(By.xpath("//span[text()='Rs.116.52']")).getText());	
//		WebElement subtt = cd.findElement(By.xpath("//span[@class='__sub-total']"));
//		System.out.println("Sub Total :"+subtt.getText());
	}
}
