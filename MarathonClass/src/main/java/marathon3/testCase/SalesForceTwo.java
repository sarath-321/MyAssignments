package marathon3.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceTwo extends ProjectSpecificMethod {

	@BeforeTest
	public void setFile() {
		fileName = "SalesForceQNDataTwo";
	}

	@Test(dataProvider = "fetchData")
	public void runSalesForceTwo(String name,String amount) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		Actions act= new Actions(driver);
        Thread.sleep(1000);
		WebElement view = driver.findElement(By.xpath("//span[contains(text(),'View All Key Deals')]"));
		act.moveToElement(view).perform();
		driver.executeScript("arguments[0].click();",view);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'slds-combobox__input slds-input')])[2]")).click();
		driver.findElement(By.xpath("//span[@title='REST API']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name,Keys.ENTER);
		List<WebElement> verify = driver.findElements(By.xpath("//a[@data-refid='recordId']"));
		boolean bl = false;
		for (WebElement webElement : verify){
			if(webElement.getText().contains(name)) {
				bl = true;
				break;
			}}
		
        if (bl) {
	       System.out.println("New opportunity is created  successfully!");
           } else {
	             System.out.println("opportunity is not created!");
                   }
	}
}
