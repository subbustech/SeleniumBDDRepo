package commonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInitialization {
	public WebDriver returnDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
