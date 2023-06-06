package marathon2.testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class BackupServiceNow {

public static void main(String[] args) throws InterruptedException {
	
	
		
	    ChromeOptions op= new ChromeOptions();
	    op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev120081.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("$AWWF0/a2afr");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(1000);
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[text()='All']").click();
		
		//Shadow sh1 = new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//input[@placeholder='Filter']").sendKeys("Service catalog");
		
		
		//Shadow sh2 = new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//mark[text()='Service Catalog']").click();
		
		//Shadow sh3 = new Shadow(driver);
		//sh3.setImplicitWait(30);
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("(//span[@class='input-group-radio'])[2]")).click();
		WebElement sel = driver.findElement(By.xpath("//div/select[@class='form-control cat_item_option ']"));
		Select sl= new Select(sel);
		sl.selectByValue("500MB");
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		driver.findElement(By.id("oi_order_now_button")).click();
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		WebElement web1 = driver.findElement(By.xpath("//span[contains(text(),'request has been submitted')]"));
		String str1=web1.getText();
		System.out.println("Response :"+str1);
		WebElement web2 = driver.findElement(By.id("requesturl"));
		String str2=web2.getText();
		System.out.println("Request number :"+str2);
		
	}

}
