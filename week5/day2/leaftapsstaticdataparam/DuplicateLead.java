package week5.day2.leaftapsstaticdataparam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@Test
	public  void runDuplicateLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sara");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sarah");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learnig Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarah@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select= new Select(state);
		select.selectByVisibleText("Alaska");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).clear();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sarath");
//		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
	

	}

}
