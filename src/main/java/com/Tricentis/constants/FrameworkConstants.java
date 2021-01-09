package com.Tricentis.constants;

public final class FrameworkConstants {
	
	//Constructor as private
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/exe/chromedriver.exe";

	/**
	 * @return the chromedriverpath
	 */
	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

}
