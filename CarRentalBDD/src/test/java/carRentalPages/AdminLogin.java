package carRentalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLogin {
	WebDriver driver;
	public AdminLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement userName() {
		return driver.findElement(By.name("username"));
	}
	
	public WebElement password() {
		return driver.findElement(By.name("password"));
	}
	
}
