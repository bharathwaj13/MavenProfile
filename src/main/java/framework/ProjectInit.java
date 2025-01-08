package framework;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import utils.PropertyReader;

public class ProjectInit {

	public WebDriver driver;
	


	public void setup() {
		String env=System.getProperty("env","dev");
		//String env ="dev";
		System.out.println("Environment: " + env);
		PropertyReader propReader=new PropertyReader(env);
		System.out.println("Browser: " + propReader.getProperty("browser"));
		driver = DriverFactory.getDriver(propReader.getProperty("browser"));

		if (driver == null) {
			throw new RuntimeException("WebDriver initialization failed!");
		}
	}

	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
