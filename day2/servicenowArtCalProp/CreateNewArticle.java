package week6.day2.servicenowArtCalProp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewArticle extends BaseClass{

	@BeforeTest
	public void setFile() {
		fileName="CreateNewArticleData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateNewArticle(String filter,String knowledgeBase, String knowledgeCatagory,String description) throws InterruptedException {

		Shadow sh1= new Shadow(driver);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@placeholder='Filter']").sendKeys(filter);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//mark[text()='Knowledge']").click();
		sh1.setImplicitWait(30);
		WebElement frame = sh1.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//span[contains(text(),'Create an Article')]").click();
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']").sendKeys(knowledgeBase);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@name='sys_display.kb_knowledge.kb_category']").sendKeys(knowledgeCatagory);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys(description);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//button[@value='sysverb_insert']").click();
		System.out.println("New article created successfully!");
		
	}	
}
