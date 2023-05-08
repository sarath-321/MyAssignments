package week7.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr"));
		int rowSize = rows.size();
		Set<String> set= new HashSet<String>();
		System.out.println("List of Security Names with duplicates :");
		System.out.println();
		for(int i=1;i<=rowSize;i++) {
			WebElement element = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr["+i+"]/td[1]"));
		    String securityName = element.getText();
		    System.out.println(securityName);
		    set.add(securityName);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		System.out.println("List of Security Names without duplicates :");
		System.out.println();
		for (String result : set) {
			System.out.println(result);
		}
		driver.close();
		

	}

}
