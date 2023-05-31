package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public ChromeDriver driver;

	@Given("Open the browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
    
	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@And("Enter the username as Demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	}

	@And("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Home page should be displayed")
	public void verifyHomepage() {
		String title = driver.getTitle();
		
		if(title.contains("Leaftaps")) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
	}

}
