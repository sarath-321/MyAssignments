package marathon3.testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceOne extends ProjectSpecificMethod {

	@BeforeTest
	public void setFile() {
		fileName="SalesForceQNData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runSalesForceOne(String search,String question,String details) {
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(search);
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement chtr = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();",chtr);
		String chatterTitle = driver.getTitle();
		System.out.println("Title :"+chatterTitle);
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(question);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(details);
		driver.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
		WebElement txt = driver.findElement(By.xpath("(//div/span[@class='uiOutputText'])[1]"));
		String str1 = txt.getText();
		
		if(question.contains(str1)) {
		System.out.println("Question appearing!");
	}
		else {
			System.out.println("Question not appearing!");}
		}
		
	}
	

