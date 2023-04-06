package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.leafground.com/radio.xhtml");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.xpath("//label[text()='Chrome']")).click();
		cd.findElement(By.xpath("//label[text()='Chennai']")).click();
		System.out.println("Default Browser :"+cd.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText());
		System.out.println("Default Age Group :"+cd.findElement(By.xpath("//label[@for='j_idt87:age:1']")).getText());
	}
}
