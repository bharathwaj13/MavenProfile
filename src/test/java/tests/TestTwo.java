package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.DriverFactory;
import framework.ProjectInit;
import utils.PropertyReader;

public class TestTwo extends ProjectInit {
	
	@BeforeMethod(alwaysRun=true)
	public void initialize() {
		System.out.println("Before Method Setup");
		setup();
	}
	
	@Test(groups= {"smoke"})
	public void launchGoogle() {
		System.out.println("Test Google");
		System.out.println("Username: "+PropertyReader.getProperty("username"));
		driver.get("https://www.google.com/");
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void cleanUp() {
		System.out.println("After Method Clean Up");
		tearDown();
	}

}
