package week5.day1.servicenow;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncident extends BaseClass {

	@Test
	public void runCreateNewIncident() throws InterruptedException {

		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(30);
		WebElement frm = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm);
		sh.findElementByXPath("//button[text()='New']").click();
		sh.setImplicitWait(30);
		WebElement name = sh.findElementByXPath("//input[@id='incident.number']");
		res = name.getAttribute("value");
		System.out.println("Incident number is :" + res);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Creating my first incident");
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Search']").sendKeys(res, Keys.ENTER);
		sh.setImplicitWait(30);
		List<WebElement> list = sh.findElementsByXPath("//a[@class='linked formlink']");
		boolean bl = false;
		for (WebElement webElement : list) {
			if (webElement.getText().contains(res)) {
				bl = true;
				break;
			}
		}
		if (bl) {
			System.out.println("New incident created successfully!");
		} else {
			System.out.println("New incident not created!");
		}

	}

}
