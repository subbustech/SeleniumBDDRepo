package stepDefinition.ex9MultipleStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import shareData.SharedClass;


public class CarRentalAdminLogintwo {

	WebDriver driver;

	public CarRentalAdminLogintwo(SharedClass sharedClass) {
		driver = sharedClass.setUp();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^user clicks on dashboard$")
	public void user_clicks_on_dashboard() throws Throwable {
		driver.findElement(By.xpath("//ul[@class='ts-sidebar-menu']//a[@href=\"dashboard.php\"]")).click();
	}

}