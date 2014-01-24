package com.tsl.example.cars.integration;

public class CarIntegrationTest extends SeleniumTestCase {
	
	public void testAddCar() throws Exception {
		selenium.open("/integration-testing-post/cars/list.html");
		selenium.click("link=Add Car");
		selenium.waitForPageToLoad("30000");
		selenium.type("make", "Mercedes");
		selenium.type("model", "SLK");
		selenium.click("btnSave");
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent("Mercedes"));
		assertTrue(selenium.isTextPresent("SLK"));
	}	
}
