package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.DriverFactory;
import framework.ProjectInit;

public class TestTwo extends ProjectInit {
	
	@BeforeMethod
	public void initialize() {
		setup();
	}
	
	@Test(groups= {"smoke"})
	public void launchGoogle() {
		driver.get("https://www.google.com/");
		
	}
	
	@AfterMethod
	public void cleanUp() {
		tearDown();
	}

}
