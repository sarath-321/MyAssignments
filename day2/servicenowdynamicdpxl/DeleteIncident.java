package week6.day2.servicenowdynamicdpxl;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClass{
	
	
	@BeforeTest
	public void setFile() {
		fileName="DeleteIncidentData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runDeleteIncident(String incNumber) {
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(30);
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(incNumber,Keys.ENTER);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//a[contains(@class,'linked formlink')]").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_delete']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='ok_button']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(incNumber, Keys.ENTER);
		sh.setImplicitWait(30);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean flag = false;
		for (WebElement webElement : list) {
			if (webElement.getText().contains(incNumber)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Incident not deleted!");
		} else {
			System.out.println("Incident deleted successfully!");
		}
		
		
		
			
	}
}
