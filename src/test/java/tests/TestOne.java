package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.DriverFactory;
import framework.ProjectInit;

public class TestOne extends ProjectInit{
	
	@BeforeMethod
	public void initialize() {
		setup();
	}
	
	@Test(groups= {"regression"})
	public void launchYahoo() {
		driver.get("https://www.yahoo.com/");
	}
	
	@AfterMethod
	public void cleanUp() {
		tearDown();
	}

}
