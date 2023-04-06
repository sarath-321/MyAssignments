package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.leafground.com/input.xhtml");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cd.findElement(By.name("j_idt88:name")).sendKeys("Sarathkumar Thangavel");
		cd.findElement(By.name("j_idt88:j_idt91")).sendKeys(", India");
		System.out.println(cd.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		cd.findElement(By.name("j_idt88:j_idt95")).clear();
		System.out.println(cd.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
		cd.findElement(By.name("j_idt88:j_idt99")).sendKeys("sara@gmail.com",Keys.TAB);
		cd.findElement(By.name("j_idt88:j_idt101")).sendKeys("Hi This is Sarath!");
		cd.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Hello Everyone!");
		//cd.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(cd.findElement(By.name("j_idt106:float-input")).getLocation());
		cd.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Sarathkumar Thangavel");
		cd.findElement(By.xpath("//li[@data-item-label='Sarathkumar Thangavel2']")).click();
		cd.findElement(By.name("j_idt106:j_idt122")).click();
		cd.findElement(By.xpath("//button[text()='s']")).click();
		cd.findElement(By.xpath("//button[@title='Close the keypad']")).click();
		cd.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("TextBox Excercise Completed");
		
}
}
