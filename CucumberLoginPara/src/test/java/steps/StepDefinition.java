package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public ChromeDriver driver;
	public String compName;

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

	@And("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
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
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is diplayed");
	}
	
	@When("Click on crmsfa link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click on Leads link")
	public void clickLeads(){
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on CreateLead link")
public void clickCreateLeadLink(){
	driver.findElement(By.linkText("Create Lead")).click();
	}
	
@Given("Enter the companyName as (.*)$")
public void enterCompName(String cname){
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	compName=cname;
}

@And("Enter the firstname as (.*)$")
public void enterFirstName(String fname){
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
}

@And("Enter the lastname as (.*)$")
public void enterLastName(String lname){
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
}

@When("Click on CreateLead button")
public void clickCreateLeadButton(){
	driver.findElement(By.name("submitButton")).click();
}

@Then("ViewLeadPage should be displayed")
public void verifyViewLeadPage(){
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	   if (text.contains(compName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
}

}
