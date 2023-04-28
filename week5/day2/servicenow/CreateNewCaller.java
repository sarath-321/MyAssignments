package week5.day2.servicenow;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends BaseClass{

	@Test
	public void runCreateNewCaller() throws InterruptedException {
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Callers");
		sh.setImplicitWait(30);
		sh.findElementByXPath("//mark[text()='Callers']").click();
		sh.setImplicitWait(30);
		WebElement frm = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[text()='New']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@id='sys_user.first_name']").sendKeys("Kamalesh");
		sh.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys("Madhan");
		sh.setImplicitWait(30);
		String text = sh.findElementByXPath("//input[@id='sys_user.last_name']").getAttribute("value");
		System.out.println("Last name :"+text);
		sh.findElementByXPath("//input[@id='sys_user.title']").sendKeys("Creating caller");
		sh.findElementByXPath("//input[@id='sys_user.email']").sendKeys("kamal@gmail.com");
		sh.findElementByXPath("//input[@id='sys_user.phone']").sendKeys("044321123");
		sh.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys("9876543210");
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@class='form-control']").sendKeys(text,Keys.ENTER);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean bl=false;
		for (WebElement webElement : list) {
			if(webElement.getText().contains(text)) {
				bl=true;
				break;
			}
		}
		if(bl) {
			System.out.println("Caller created successfully!");
		}
		else {
			System.out.println("Caller not created!");
		}

	}
}
