package marathon1.testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(option);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.get("https://www.redbus.in/");
		cd.findElement(By.id("src")).sendKeys("Chennai");
		cd.findElement(By.className("selected")).click();
		cd.findElement(By.id("dest")).sendKeys("Bangalore");
		cd.findElement(By.className("selected")).click();
		cd.findElement(By.xpath("//td[text()='6']")).click();
		cd.findElement(By.id("search_btn")).click();
		System.out.println(cd.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		cd.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		System.out.println(cd.findElement(By.xpath("//div[text()='KMRL Kalaimakal']")).getText());
		System.out.println(cd.getTitle());
		
	}
}