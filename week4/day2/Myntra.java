package week4.day2;

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

public class Myntra {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions act= new Actions(driver);
        WebElement men = driver.findElement(By.linkText("Men"));
        act.moveToElement(men).perform();
        WebElement jkt = driver.findElement(By.xpath("(//li/a[text()='Jackets'])[1]"));
        driver.executeScript("arguments[0].click();", jkt);
        WebElement ttlCnt = driver.findElement(By.xpath("//div/span[@class='title-count']"));
        System.out.println("Total count of the item :"+ttlCnt.getText());
        WebElement txt1 = driver.findElement(By.xpath("//label[text()='Jackets']"));
        String t1=txt1.getText();
        System.out.println("Category :"+t1);
        WebElement txt2 = driver.findElement(By.xpath("//label[text()='Rain Jacket']"));
        String t2=txt2.getText();
        System.out.println("         :"+t2);
        WebElement prc1 = driver.findElement(By.xpath("(//label/span[@class='categories-num'])[1]"));
        String pc1=prc1.getText();
        String str1=pc1.replaceAll("[^0-9]", "");
        int i=Integer.parseInt(str1);
        WebElement prc2 = driver.findElement(By.xpath("(//label/span[@class='categories-num'])[2]"));
        String pc2=prc2.getText();
        String str2=pc2.replaceAll("[^0-9]", "");
        int j=Integer.parseInt(str2);
        int k=i+j;
        System.out.println("Sum of categories count :"+k);
        driver.findElement(By.xpath("(//label/span[@class='categories-num'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='brand-more']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
        driver.findElement(By.xpath("//label[text()='Duke']")).click();
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
        
//        WebElement pages = driver.findElement(By.xpath("//li[@class='pagination-paginationMeta']"));
//        System.out.println(pages.getText());
        
        List<WebElement> list = driver.findElements(By.xpath("//h3[text()='Duke']"));
        List<WebElement> pgl = driver.findElements(By.xpath("//li[@class='pagination-number']"));
        //System.out.println("Pages :"+pgl.size());
        
        int count=0;
        for(int x=1;x<=pgl.size();x++) {
        	driver.findElement(By.xpath("(//li[@class='pagination-number'])"+"["+x+"]")).click();
        	List<WebElement> inList = driver.findElements(By.xpath("//h3[text()='Duke']"));
            
            count=count+inList.size();
        }
        int finalCount=count+list.size();
        System.out.println("The count of brand Duke coats are  :"+finalCount);
        WebElement sort = driver.findElement(By.className("sort-sortBy"));
        act.moveToElement(sort).perform();
        driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
        WebElement firstProPrice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
        System.out.println("Price of the first displayed item :"+firstProPrice.getText());
        driver.findElement(By.xpath("(//picture[@class='img-responsive'])[1]")).click();
        Set<String> wh = driver.getWindowHandles();
        List<String> whs= new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        File obj= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(obj, new File("C:\\Users\\sara\\Pictures\\Screenshots\\myntraimg.jpg"));
        driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
        act.pause(1000).perform();
        driver.quit();
  
	}

}
