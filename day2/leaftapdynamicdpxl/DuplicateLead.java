package week6.day2.leaftapdynamicdpxl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@BeforeTest
	public void setFile() {
		fileName="DuplicateLeadData";
	}
	
	@Test(dataProvider = "fetchData")
	public  void runDuplicateLead(String companyName,String firstName,String lastName,String firstNameLocal,String departmentName,String description,String email,String dupCompanyName,String dupFirstNameLocal) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(firstNameLocal);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(departmentName);
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select= new Select(state);
		select.selectByVisibleText("Alaska");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		System.out.println("Lead Created Successfully!");
		//driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(dupCompanyName);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).clear();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(dupFirstNameLocal);
//		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		System.out.println("DuplicateLead Created Successfully!");
	

	}

}
