package com.tsl.example.cars.integration;

import junit.framework.TestCase;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public abstract class SeleniumTestCase extends TestCase {

	protected Selenium selenium;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
        selenium = new DefaultSelenium(
        		"localhost", 
        		SeleniumServer.getDefaultPort(), 
        		"*iehta", 
        		"http://localhost:9080");
        selenium.start();
	}
    
    @Override
    protected void tearDown() throws Exception {
    	selenium.stop();
    	super.tearDown();
    }
}
