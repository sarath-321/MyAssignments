package week5.day1.servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClass {

	public EdgeDriver driver;
	public static String res;
	
	@BeforeMethod
	public void preCondition() throws InterruptedException{
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev56580.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//30

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("Happynewyear!123");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);

		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(50);
		sh.findElementByXPath("//div[text()='All']").click();

		Shadow sh1 = new Shadow(driver);
		sh1.setImplicitWait(30);
		sh1.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Incidents");

		Shadow sh2 = new Shadow(driver);
		sh2.setImplicitWait(30);
		sh2.findElementByXPath("//a[contains(@class,'nested-item item-label keyboard-navigatable highlighted-item')]")
				.click();

		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
