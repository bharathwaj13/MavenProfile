package framework;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import utils.PropertyReader;

public class ProjectInit {

	public WebDriver driver;
	public String browser;


	public void setup() {
		String env=System.getProperty("env","dev");
		PropertyReader propReader=new PropertyReader(env);
		DriverFactory.setDriver(browser);
		driver=DriverFactory.getDriver();
		
		 System.out.println("Environment: " + env);
	     System.out.println("Browser: " + browser);

		if (driver == null) {
			throw new RuntimeException("WebDriver initialization failed!");
		}
	}

	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
