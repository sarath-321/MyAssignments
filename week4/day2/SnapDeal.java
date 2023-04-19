package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SnapDeal {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        Actions act= new Actions(driver);
        WebElement mf = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
        act.moveToElement(mf).perform();
        driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        WebElement cCount = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
        System.out.println("Count of the mens sports shoes :"+cCount.getText());
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
        driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
        driver.findElement(By.xpath("//input[@name='toVal']")).clear();
        driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
        act.pause(2000).perform();
        driver.findElement(By.xpath("//div[contains(@class,'arrow btn')]")).click();
        WebElement nvy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
        driver.executeScript("arguments[0].click();", nvy);
        WebElement mhPic = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        act.moveToElement(mhPic).perform();
        WebElement qkView = driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
        driver.executeScript("arguments[0].click();", qkView);
        WebElement cost = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
        System.out.println("Cost of the product :"+cost.getText());
        WebElement disCnt = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
        System.out.println("Cost of the product :"+disCnt.getText());
        File obj= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(obj, new File("C:\\Users\\sara\\Pictures\\Screenshots\\snapdealimg.jpg"));
        driver.findElement(By.xpath("//div/div[2]/i[@class='sd-icon sd-icon-delete-sign']")).click();
        act.pause(2000).perform();
        driver.quit();
	}

}
