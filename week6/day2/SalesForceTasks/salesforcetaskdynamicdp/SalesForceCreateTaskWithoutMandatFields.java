package week6.day2.salesforcetaskdynamicdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SalesForceCreateTaskWithoutMandatFields extends ProjectSpecificMethod{

	@BeforeTest
	public void setFile() {
		fileName="SalesForceCreateTaskWithoutMandatFieldsData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runSalesForceCreateTaskWithoutMandatFields(String comments) {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Tasks']"));
		driver.executeScript("arguments[0].click();", clk);
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'entityIcon slds-icon slds-icon--small slds-float--left forceEntityIcon')])[2]")).click();
		driver.findElement(By.xpath("//span[@title='Contacts']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(comments);
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		WebElement findElement1 = driver.findElement(By.xpath("//span[@class='genericError uiOutputText']"));
		String text1 = findElement1.getText();
		System.out.println(text1);
		WebElement findElement2 = driver.findElement(By.xpath("//ul[@class='errorsList']"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		String text3 = findElement3.getText();
		System.out.println("Alert message :"+text3);
		
		
		
		
		
	}
}
