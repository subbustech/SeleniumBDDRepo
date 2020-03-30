package stepDefinition.ex3Background;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Ex3CarRentalAdminLogin {
	
WebDriver driver;
	
	@Given("^user is on admin login page$")
	public void user_is_on_admin_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/carrental/admin");
	}
	
	@When("^Title of the login page is Admin Login$")
	public void title_of_the_login_page_is_Admin_Login() throws Throwable {
	    if(driver.getTitle().equalsIgnoreCase("Car Rental Portal | Admin Login")) {
	    	System.out.println("Title is verified succesffully");
	    }
	    else {
	    	System.out.println("Title can't be verified");
	    }
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
	
	@Then("^Heading on the page is dashboard$")
	public void heading_on_the_page_is_dashboard() throws Throwable {
	    String pageHeading = driver.findElement(By.xpath("//h2")).getText();
	    Assert.assertEquals("Dashboard", pageHeading);
	}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    driver.close();
	}
	
	@Then("^user clicks on Manage Bookings$")
	public void user_clicks_on_Manage_Bookings() throws Throwable {
	    driver.findElement(By.xpath("//a[@href='manage-bookings.php']")).click();
	}

	@Then("^user verifies that the heading is Manage Bookings$")
	public void user_verifies_that_the_heading_is_Manage_Bookings() {
	    String headerManageBookings = driver.findElement(By.xpath("//h2[@class='page-title']")).getText();
	    Assert.assertEquals("Manage Bookings", headerManageBookings);
	}

	@Then("^user clicks on Manage Testimonials$")
	public void user_clicks_on_Manage_Testimonials() {
		driver.findElement(By.xpath("//a[@href='testimonials.php']")).click();
	}

	@Then("^user verifies that the heading is Manage Testimonials$")
	public void user_verifies_that_the_heading_is_Manage_Testimonials() {
		String headerManageTestimonials = driver.findElement(By.xpath("//h2[@class='page-title']")).getText();
	    Assert.assertEquals("Manage Testimonials", headerManageTestimonials);
	}
}