package week5.day2.leaftapsstaticdataparam;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test
	public  void runCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sara");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("th");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
	}

}
