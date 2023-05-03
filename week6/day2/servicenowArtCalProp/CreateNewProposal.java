package week6.day2.servicenowArtCalProp;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class CreateNewProposal extends BaseClass {

	@BeforeTest
	public void setFile() {
		fileName="CreateNewProposalData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateNewProposal(String filter,String description) {

		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys(filter);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//span[contains(text(),'My ')]").click();
		sh.setImplicitWait(30);
		WebElement frm = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frm);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[text()='New']").click();
		sh.setImplicitWait(30);
		String propId = sh.findElementByXPath("//input[@id='std_change_proposal.number']").getAttribute("value");
		System.out.println("Proposal ID :" + propId);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@id='std_change_proposal.short_description']").sendKeys(description);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		sh.setImplicitWait(30);
		List<WebElement> list = sh.findElementsByXPath("//a[contains(@class,'linked formlink')]");
		boolean bln = false;
		for (WebElement result : list) {
			if (result.getText().contains(propId)) {
				bln = true;
				break;
			}

		}

		if (bln) {
			System.out.println("New proposal created successfully!");
		} else {
			System.out.println("Proposal not created!");
		}

	}
}
