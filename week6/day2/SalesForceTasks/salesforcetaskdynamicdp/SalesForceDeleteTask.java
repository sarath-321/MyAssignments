package week6.day2.salesforcetaskdynamicdp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceDeleteTask extends ProjectSpecificMethod{

	@Test
	public void runSalesForceDeleteTask() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Tasks']"));
		driver.executeScript("arguments[0].click();", clk);
//		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[1]")).click();
//		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();
		WebElement findElement = driver.findElement(By.xpath("//div/span[@class='uiOutputText']"));
		String text = findElement.getText();
		System.out.println("Name "+text);
		driver.findElement(By.xpath("(//li[@data-aura-class='oneActionsDropDown'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		WebElement web = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		String msg = web.getText();
		System.out.println("Message :"+msg);
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div/span[@class='uiOutputText']"));
		boolean bl=false;
		for (WebElement webElement : list) {
			String text2 = webElement.getText();
			if(text.contains(text2)) {
				bl=true;
			}
		}
		if(bl) {
			System.out.println("Task is available!");
		}
		else {
			System.out.println("Task is not available!");
		}
	}
}
