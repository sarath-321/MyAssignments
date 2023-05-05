package week6.day2.salesforcetaskdynamicdp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class ProjectSpecificMethod {


	public ChromeDriver driver;
	public String fileName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String uname,String pwd) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
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
