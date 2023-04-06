package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.id("username")).sendKeys("demoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Contacts")).click();
		cd.findElement(By.linkText("Create Contact")).click();
		cd.findElement(By.id("firstNameField")).sendKeys("sara");
		cd.findElement(By.id("lastNameField")).sendKeys("H");
		cd.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sara");
		cd.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("H");
		cd.findElement(By.name("departmentName")).sendKeys("IT");
		cd.findElement(By.name("description")).sendKeys("creating contact");
		cd.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sara@gmail.com");
		
		WebElement state = cd.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sl= new Select(state);
		sl.selectByVisibleText("New York");
		
		cd.findElement(By.name("submitButton")).click();
		cd.findElement(By.linkText("Edit")).click();
		cd.findElement(By.name("description")).clear();
		cd.findElement(By.name("importantNote")).sendKeys("contact details edited successfully!");
		cd.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = cd.getTitle();
		System.out.println(title);
		
		
		
		

	}

}
