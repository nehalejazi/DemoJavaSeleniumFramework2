package com.Tricentis.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Tricentis.constants.FrameworkConstants;

public final class Driver {
	
	private Driver()
	{
		
	}

	private static WebDriver driver;
	

	public static void initDriver() {
		if(Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
			driver = new ChromeDriver();//Ctrl+shif+O  shortcut to import packages
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get("http://demowebshop.tricentis.com/");
		}
	}

	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
