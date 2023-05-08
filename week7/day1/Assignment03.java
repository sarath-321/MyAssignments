package week7.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://html.com/tags/table/");
		List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		int rowSize = elements.size();
		//System.out.println("Number of rows are :"+rowSize);
		List<WebElement> elements2 = driver.findElements(By.xpath("(//table)[1]/tbody/tr[1]/td"));
		int columnSize = elements2.size();
		//System.out.println("Number of columns are :"+columnSize);
		
		String lib="Absolute Usage";
		System.out.println("Respective values based on given Library '"+lib+"' is :");
		
		for(int i=1;i<=rowSize;i++) {
			WebElement elm1 = driver.findElement(By.xpath("(//table)[1]/tbody/tr["+i+"]/td[1]"));
			String str1 = elm1.getText();
			
			if(str1.contains(lib)) {
				
				for(int j=2;j<=columnSize;j++) {
					WebElement elm2 = driver.findElement(By.xpath("(//table)[1]/tbody/tr["+i+"]/td["+j+"]"));
					WebElement elmTh = driver.findElement(By.xpath("(//table)[1]/thead/tr/th["+j+"]"));
					String thResult = elmTh.getText();
					String result = elm2.getText();
					System.out.println(thResult+"--->"+result);
				}
			}
		}
		driver.close();

	}

}
