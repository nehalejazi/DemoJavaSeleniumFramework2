package com.Tricentis.tests;


import org.testng.annotations.Test;

import com.Tricentis.driver.Driver;
import com.Tricentis.driver.DriverManager;

public final class HomePageTest extends BaseTest {
	
	private HomePageTest()
	{
		
	}
	
	@Test
	public void Login()
	{
		
		String title =DriverManager.getDriver().getTitle();
		System.out.println(title);
		
	}

}
