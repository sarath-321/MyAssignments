package week6.day2.servicenowdynamicdpxl;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class BaseClass {

	public EdgeDriver driver;
	public static String incidentNumber;
	public String fileName;
	
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void preCondition(String url,String userName,String password) throws InterruptedException{
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.name("user_name")).sendKeys(userName);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(50);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Incidents");
		sh.setImplicitWait(30);
		sh.findElementByXPath("//a[contains(@class,'nested-item item-label keyboard-navigatable highlighted-item')]")
				.click();
	
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return ReadExcelData.readExcel(fileName);
		
	}
}
