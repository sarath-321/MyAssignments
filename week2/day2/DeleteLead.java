package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
//		cd.findElement(By.xpath("//span[text()='Phone']")).click();
//		cd.findElement(By.name("phoneCountryCode")).sendKeys("+91");
//		cd.findElement(By.name("phoneNumber")).sendKeys("9876543210");

		// there is no phone number I used name and id
		
		cd.findElement(By.xpath("//span[text()='Name and ID']")).click();
		cd.findElement(By.name("id")).sendKeys("10061");		
		cd.findElement(By.xpath("//button[text()='Find Leads']"));
		cd.findElement(By.linkText("10061")).click();
		cd.findElement(By.linkText("Delete")).click();
		cd.findElement(By.linkText("Find Leads")).click();
		cd.findElement(By.name("id")).sendKeys("10061");
				
		try {
	    Thread.sleep(2000);
		cd.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//cd.close();
	}

}
