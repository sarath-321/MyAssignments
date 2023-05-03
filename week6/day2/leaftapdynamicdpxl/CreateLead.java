package week6.day2.leaftapdynamicdpxl;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFile() {// step 3:create a method to set a file name 
		fileName="CreateLeadData";
	}
	
	@Test(dataProvider ="fetchData")
	public void runCreateLead(String cname,String fname,String lname,String phname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phname);
		driver.findElement(By.name("submitButton")).click();
		text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		
	}
	

}
