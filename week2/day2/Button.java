package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.leafground.com/button.xhtml");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		cd.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(cd.getTitle());
		cd.navigate().back();
		System.out.println(cd.findElement(By.xpath("//span[text()='Disabled']")).isEnabled());
		System.out.println(cd.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		
		
		
		
	}

}
