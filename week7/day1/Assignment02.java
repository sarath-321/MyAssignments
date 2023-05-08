package week7.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://html.com/tags/table/");
		List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		int rowSize = elements.size();
		System.out.println("Number of rows are :"+rowSize);
		List<WebElement> elements2 = driver.findElements(By.xpath("(//table)[1]/tbody/tr[1]/td"));
		int columnSize = elements2.size();
		System.out.println("Number of columns are :"+columnSize);
		driver.close();
		

	}

}
