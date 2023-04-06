package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.leafground.com/checkbox.xhtml");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.xpath("//span[text()='Basic']")).click();
		cd.findElement(By.xpath("//span[text()='Ajax']")).click();
		cd.findElement(By.xpath("//label[text()='Java']")).click();
		cd.findElement(By.xpath("//label[text()='Javascript']")).click();
		cd.findElement(By.xpath("(//div/div[2][@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]")).click();
		cd.findElement(By.className("ui-toggleswitch-slider")).click();
		System.out.println(cd.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled());
		cd.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		cd.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		cd.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		cd.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		cd.findElement(By.xpath("//a/span[@class='ui-icon ui-icon-circle-close']")).click();
	}
}
