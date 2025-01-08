package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.DriverFactory;
import framework.ProjectInit;
import utils.PropertyReader;

public class TestOne extends ProjectInit{
	
	@BeforeMethod(alwaysRun=true)
	public void initialize() {
		System.out.println("Before Method Setup");
		setup();
	}
	
	@Test(groups= {"regression"})
	public void launchYahoo() {
		System.out.println("Test Yahoo");
		System.out.println("Username: "+PropertyReader.getProperty("username"));
		driver.get("https://www.yahoo.com/");
	}
	
	@AfterMethod(alwaysRun=true)
	public void cleanUp() {
		System.out.println("After Method Clean Up");
		tearDown();
	}

}
