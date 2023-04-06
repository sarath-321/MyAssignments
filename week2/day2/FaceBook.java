package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://en-gb.facebook.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.linkText("Create new account")).click();
		cd.findElement(By.name("firstname")).sendKeys("sara");
		cd.findElement(By.name("lastname")).sendKeys("h");
		cd.findElement(By.name("reg_email__")).sendKeys("9876543210");
		cd.findElement(By.id("password_step_input")).sendKeys("sa!123");
		
		WebElement dd = cd.findElement(By.id("day"));
		Select sl1= new Select(dd);
		sl1.selectByValue("3");
		
		WebElement mm = cd.findElement(By.id("month"));
		Select sl2= new Select(mm);
		sl2.selectByValue("3");
		
		WebElement yyyy = cd.findElement(By.id("year"));
		Select sl3= new Select(yyyy);
		sl3.selectByValue("2000");
		
		cd.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		

	}

}
