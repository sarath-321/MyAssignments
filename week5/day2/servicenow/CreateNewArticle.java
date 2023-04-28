package week5.day2.servicenow;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewArticle extends BaseClass{

	@Test
	public void runCreateNewArticle() throws InterruptedException {

		Shadow sh1= new Shadow(driver);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Knowledge");
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//mark[text()='Knowledge']").click();
		sh1.setImplicitWait(30);
		WebElement frame = sh1.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//span[contains(text(),'Create an Article')]").click();
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']").sendKeys("IT");
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@name='sys_display.kb_knowledge.kb_category']").sendKeys("Java");
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys("Creating new article");
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//button[@value='sysverb_insert']").click();
		System.out.println("New article created successfully!");
		
	}	
}
