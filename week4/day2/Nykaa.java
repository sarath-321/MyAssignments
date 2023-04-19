package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act= new Actions(driver);
        WebElement brands = driver.findElement(By.xpath("//li/a[text()='brands']"));
        act.moveToElement(brands).perform();
        driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
        driver.findElement(By.linkText("L'Oreal Paris")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.className("sort-name")).click();
        driver.findElement(By.xpath("//div/span[text()='customer top rated']")).click();
        driver.findElement(By.xpath("//span[text()='Category']")).click();
        driver.findElement(By.xpath("//li/div/span[text()='Hair']")).click();
        driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
        driver.findElement(By.xpath("//span[text()='Concern']")).click();
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
        WebElement smp = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]"));
        WebElement clrPro = driver.findElement(By.xpath("(//span[@class='filter-value'])[2]"));
        System.out.println("Applied filter names :"+smp.getText()+","+clrPro.getText());
        driver.findElement(By.xpath("//div[contains(text(),'Paris Colour')]")).click();
        Set<String> wh = driver.getWindowHandles();
        List<String> whs= new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        WebElement select = driver.findElement(By.xpath("//select[@title='SIZE']"));
        Select sl= new Select(select);
        sl.selectByIndex(1);
        WebElement mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
        System.out.println("MRP of the product is :"+mrp.getText());
        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();        
        driver.switchTo().frame(0);
        WebElement grndTtl = driver.findElement(By.xpath("//div//span[contains(@class,'css-1um')]"));
        System.out.println("Grand total amount :"+grndTtl.getText());
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        driver.switchTo().window(whs.get(1));
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
        driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
        WebElement finalGrndTtl = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
        System.out.println("Final grand total :"+finalGrndTtl.getText());
        act.pause(3000).perform();
        driver.quit();  
	}
}
