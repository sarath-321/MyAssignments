package week6.day2.servicenowArtCalProp;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends BaseClass{

	@BeforeTest
	public void setFile() {
		fileName="CreateNewCallerData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateNewCaller(String filter,String firstName,String lastName,String userTitle,String email,String bussPhone,String mobPhone) throws InterruptedException {
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys(filter);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//mark[text()='Callers']").click();
		sh.setImplicitWait(30);
		WebElement frm = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[text()='New']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@id='sys_user.first_name']").sendKeys(firstName);
		sh.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys(lastName);
		sh.setImplicitWait(30);
		String text = sh.findElementByXPath("//input[@id='sys_user.last_name']").getAttribute("value");
		System.out.println("Last name :"+text);
		sh.findElementByXPath("//input[@id='sys_user.title']").sendKeys(userTitle);
		sh.findElementByXPath("//input[@id='sys_user.email']").sendKeys(email);
		sh.findElementByXPath("//input[@id='sys_user.phone']").sendKeys(bussPhone);
		sh.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys(mobPhone);
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
