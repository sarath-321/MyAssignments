package testingsheetrename;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceCreateTask extends ProjectSpecificMethod {

	@BeforeTest
	public void setFile() {
		fileName="createTask";
	}
	
	@Test(dataProvider = "fetchData")
	public void runSalesForceCreateTask(String search,String subject) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(search);
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//input[@aria-haspopup='listbox']")).sendKeys(subject);
		driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//li/a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		WebElement web = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String msg = web.getText();
		System.out.println("Message :"+msg);
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("(//div/span[@class='uiOutputText'])[1]"));
		String str1 = txt.getText();
		
		if(subject.contains(str1)) {
		System.out.println("Task created successfully!");
	    }
		else {
			System.out.println("Task not created!");}
		}
		
	}
	

