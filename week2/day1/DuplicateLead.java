package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.manage().window().maximize();
		
		cd.findElement(By.id("username")).sendKeys("demoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("Create Lead")).click();
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		cd.findElement(By.id("createLeadForm_firstName")).sendKeys("Sara");
		cd.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
		cd.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sarah");
		cd.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		cd.findElement(By.id("createLeadForm_description")).sendKeys("Learnig Selenium");
		cd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarah@gmail.com");
		
		WebElement state = cd.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select= new Select(state);
		select.selectByVisibleText("Alaska");
		
		cd.findElement(By.className("smallSubmit")).click();
		String title1 = cd.getTitle();
		System.out.println(title1);
		
		//cd.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		cd.findElement(By.linkText("Duplicate Lead")).click();
		
		cd.findElement(By.id("createLeadForm_companyName")).clear();
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		
		cd.findElement(By.id("createLeadForm_firstNameLocal")).clear();
		cd.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sarath");
//		cd.findElement(By.xpath("//input[@value='Create Lead']")).click();
		cd.findElement(By.className("smallSubmit")).click();
		
		String title2 = cd.getTitle();
		System.out.println(title2);
	

	}

}
