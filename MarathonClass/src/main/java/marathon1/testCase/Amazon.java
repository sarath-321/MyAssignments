package marathon1.testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(option);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.get("https://www.amazon.in/");
		cd.findElement(By.name("field-keywords")).sendKeys("Bags");
		cd.findElement(By.xpath("//div[@aria-label='bags for mens']")).click();		
		String text1 = cd.findElement(By.xpath("//span[text()='1-16 of over 80,000 results for']")).getText();
		String text2 = cd.findElement(By.xpath("//span[text()='\"bags for mens\"']")).getText();
		System.out.println(text1+" "+text2);
		cd.findElement(By.xpath("//span[text()='American Tourister']")).click();
		cd.findElement(By.xpath("//span[text()='Gear']")).click();
		cd.findElement(By.xpath("//span[text()='Featured']")).click();
		cd.findElement(By.id("s-result-sort-select_4")).click();
		String name = cd.findElement(By.xpath("//span[text()='Gear LOGI-Q 28L Water Resistant Laptop Bag/Backpack/Office Bag for Men/Women with Rain Cover (Black-White)']")).getText();
		String price = cd.findElement(By.xpath("//span[text()='1,058']")).getText();
		System.out.println("Bag Name :"+name+" Discounted price :"+price);
		System.out.println("Title :"+cd.getTitle());
		//cd.close();
	}
}
