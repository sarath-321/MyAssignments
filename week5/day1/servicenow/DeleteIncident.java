package week5.day1.servicenow;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClass{
	
	@Parameters({"deleteIncidentNum"})
	@Test(dependsOnMethods = "week5.day1.servicenow.CreateNewIncident.runCreateNewIncident")
	
	public void runDeleteIncident(String delNum) {
		
		Shadow sh= new Shadow(driver);
		sh.setImplicitWait(30);
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(delNum,Keys.ENTER);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//a[contains(@class,'linked formlink')]").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_delete']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='ok_button']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(delNum, Keys.ENTER);
		sh.setImplicitWait(30);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean bl = false;
		for (WebElement webElement : list) {
			if (webElement.getText().contains(delNum)) {
				bl = true;
				break;
			}
		}
		if (bl) {
			System.out.println("Incident not deleted!");
		} else {
			System.out.println("Incident deleted successfully!");
		}
		
		
		
			
	}
}
