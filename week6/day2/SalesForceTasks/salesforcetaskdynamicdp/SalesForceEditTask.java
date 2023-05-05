package week6.day2.salesforcetaskdynamicdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceEditTask extends ProjectSpecificMethod{


	@Test
	public void runSalesForceEditTask() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Tasks']"));
		driver.executeScript("arguments[0].click();", clk);
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();
		driver.findElement(By.xpath("(//li[@data-aura-class='oneActionsDropDown'])[2]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='5'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
		driver.findElement(By.xpath("//li/a[text()='Low']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		WebElement web = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String msg = web.getText();
		System.out.println("Message :"+msg);
		
	}
}
