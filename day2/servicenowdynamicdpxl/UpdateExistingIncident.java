package week6.day2.servicenowdynamicdpxl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends BaseClass{
	
	@BeforeTest
	public void setFile() {
		fileName="UpdateExistingIncidentData";
	}
	@Test(dataProvider = "fetchData")
	public void runUpdateExistingIncident(String incNumber) throws InterruptedException{
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(30);
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(incNumber,Keys.ENTER);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//a[contains(@class,'linked formlink')]").click();
		sh.setImplicitWait(30);
		WebElement select = sh.findElementByXPath("//select[contains(@name,'urgency')]");
		Select sl= new Select(select);
		sl.selectByValue("1");
		sh.setImplicitWait(30);
		WebElement select1 = sh.findElementByXPath("//select[contains(@name,'state')]");
		Select sl1= new Select(select1);
		sl1.selectByValue("2");
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_update_bottom']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//a[contains(@class,'linked formlink')]").click();
		Thread.sleep(2000);
		System.out.println("Incident updated successfully!");
		
		
	}
}
