package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.manage().window().maximize();

		cd.findElement(By.id("username")).sendKeys("demoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("Find Leads")).click();
//		cd.findElement(By.xpath("//span[text()='Email']")).click();
//		cd.findElement(By.name("emailAddress")).sendKeys("sara@gmail.com");

		cd.findElement(By.name("firstName")).sendKeys("Marco");
		cd.findElement(By.name("lastName")).sendKeys("Reus");
		cd.findElement(By.xpath("//button[text()='Find Leads']")).click();
		cd.findElement(By.linkText("Marco")).click();
		cd.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(cd.getTitle());
		cd.findElement(By.name("submitButton")).click();
		// cd.close();

	}

}
