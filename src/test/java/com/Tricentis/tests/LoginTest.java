package com.Tricentis.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Tricentis.driver.Driver;
import com.Tricentis.driver.DriverManager;



public final class LoginTest extends BaseTest  {
	
	private LoginTest()
	{
		
	}
	
	
	@Test
	public void Login()
	{
		
		DriverManager.getDriver().findElement(By.cssSelector("#small-searchterms")).sendKeys("Phone",Keys.ENTER);
		
	}

}
