import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverDemo {

	String driverPath = "C:\\Gecko\\GeckoDriver.exe";
	public WebDriver driver;

	@Before
	public void startBrowser() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();

	}

	@Test
	public void navigateToUrl() {
		driver.get("http://demo.testfire.net");
	}

	@After
	public void endTest() {
		driver.quit();
	}

}