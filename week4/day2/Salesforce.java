package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//span[text()='Learn More']")).click();
        Set<String> wh = driver.getWindowHandles();
        List<String> whs= new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        String title = driver.getTitle();
        System.out.println("Title :"+title);
        Thread.sleep(3000);
        driver.switchTo().window(whs.get(0));
        Thread.sleep(2000);
        driver.quit();
        

	}

}
