package marathon2.testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.sukgu.Shadow;

public class Salesforce1 {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> whs = new ArrayList<String>(wh);
		driver.switchTo().window(whs.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow sh = new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		Shadow sh1 = new Shadow(driver);
		WebElement trl = sh1.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act = new Actions(driver);
		act.moveToElement(trl).perform();
		Shadow sh2 = new Shadow(driver);
		sh2.findElementByXPath("//a[text()='Salesforce Certification']").click();
		driver.findElement(By.xpath("//div/a[text()='Administrator']")).click();
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='trailMix-card-body_title']"));
		System.out.println("List of Administrator Certifications are :");
		for (int i = 1; i <= list.size(); i++) {
			WebElement tt = driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title'])" + "[" + i + "]"));
			String st = tt.getText();
			System.out.println(" " + st);
		}

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\sara\\Pictures\\Screenshots\\salesforce1img.jpg"));

	}

}
