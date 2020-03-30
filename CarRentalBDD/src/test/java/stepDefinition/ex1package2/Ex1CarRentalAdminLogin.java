package stepDefinition.ex1package;

import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import carRentalPages.AdminLogin;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Ex1CarRentalAdminLogin {
	
WebDriver driver;

	AdminLogin al;
	
	@Given("^user is on admin login page$")
	public void user_is_on_admin_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		al = new AdminLogin(driver);
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

//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("Test@12345");
//	}
	
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String userName, String password) throws Throwable {
//		System.out.println(userName);
//		System.out.println(password);
//		driver.findElement(By.name("username")).sendKeys(userName);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
	
	@Then("^user enters login details$")
	public void user_enters_login_details(DataTable loginDetails) throws Throwable {
		List<List<String>> logindetailvalues = loginDetails.raw();
		al.userName().sendKeys(logindetailvalues.get(0).get(0));
		al.password().sendKeys(logindetailvalues.get(0).get(1));
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
	    //Assert.assertEquals("Dashboard", pageHeading);
	}
	
	@Then("^user clicks on vehicles on left naviagion$")
	public void user_clicks_on_vehicles_on_left_naviagion() throws Throwable {
	    driver.findElement(By.xpath("//a[contains(text(), 'Vehicles')]")).click();
	}

	@Then("^user clicks on post a vehicle on left naviation$")
	public void user_clicks_on_post_a_vehicle_on_left_naviation() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Post a Vehicle']")).click();
	}

//	@Then("^user enters vehicle details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_vehicle_details_and_and(String vehicleTitle, String vehicleOverview, String pricePerDay) throws Throwable {
//		driver.findElement(By.xpath("//input[@name='vehicletitle']")).sendKeys(vehicleTitle);
//		driver.findElement(By.xpath("//textarea[@name='vehicalorcview']")).sendKeys(vehicleOverview);
//		driver.findElement(By.xpath("//input[@name='priceperday']")).sendKeys(pricePerDay);
//	}
	
	@Then("^user enters vehicle details$")
	public void user_enters_vehicle_details(DataTable vehicleDetials) throws Throwable {
		List<List<String>> vehicleDetailValues = vehicleDetials.raw();
		driver.findElement(By.xpath("//input[@name='vehicletitle']")).sendKeys(vehicleDetailValues.get(0).get(0));
		driver.findElement(By.xpath("//textarea[@name='vehicalorcview']")).sendKeys(vehicleDetailValues.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='priceperday']")).sendKeys(vehicleDetailValues.get(0).get(2));
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    driver.close();
	}
}