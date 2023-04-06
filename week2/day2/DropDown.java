package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.leafground.com/select.xhtml");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement auTool = cd.findElement(By.xpath("//div/select[@class='ui-selectonemenu']"));
		Select sl1= new Select(auTool);
		sl1.selectByIndex(1);
		
		cd.findElement(By.xpath("//label[text()='Select Country']")).click();
		cd.findElement(By.xpath("//li[text()='India']")).click();
		
		cd.findElement(By.xpath("//label[text()='Select City']")).click();
		cd.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		
		
		cd.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		cd.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		cd.findElement(By.xpath("//label[text()='Select Language']")).click();
		cd.findElement(By.xpath("//li[text()='English']")).click();
		
//		cd.findElement(By.xpath("//label[text()='Select Values']")).click();
//		cd.findElement(By.xpath("//li[text()='Two']")).click();

	}

}
