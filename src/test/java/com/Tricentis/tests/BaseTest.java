package com.Tricentis.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Tricentis.constants.FrameworkConstants;
import com.Tricentis.driver.Driver;

public class BaseTest {
	
	protected BaseTest()
	{
		
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quitDriver();
	}

}
