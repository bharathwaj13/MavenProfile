package factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	//private static DriverFactory instance = null;
	private static WebDriver driver;

	private DriverFactory() {}

	/*
	 * public static DriverFactory getInstance() {
	 * 
	 * if(instance==null) { synchronized() { if(instance==null) { instance=new
	 * DriverFactory(); } } } return instance;
	 * 
	 * }
	 */

	public static void setDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();;
			driver=new FirefoxDriver();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
