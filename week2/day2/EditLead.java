package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.id("username")).sendKeys("demoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("Find Leads")).click();
		cd.findElement(By.xpath("//span[text()='Name and ID']")).click();
		cd.findElement(By.xpath("(//div/div/input[@name='firstName'])[3]")).sendKeys("Jamal");
		cd.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		WebElement sl = cd.findElement(By.xpath("(//div/a[text()='Jamal'])[1]"));
		cd.executeScript("arguments[0].click()", sl);
		System.out.println(cd.getTitle());
		cd.findElement(By.linkText("Edit")).click();
		cd.findElement(By.id("updateLeadForm_companyName")).clear();
		cd.findElement(By.id("updateLeadForm_companyName")).sendKeys("TL Systems");
		cd.findElement(By.className("smallSubmit")).click();
		//cd.close();
	}

}
