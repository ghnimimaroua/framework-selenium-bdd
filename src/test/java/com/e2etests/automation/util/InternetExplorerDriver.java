package com.e2etests.automation.util;

public class InternetExplorerDriver extends DriverManager {

	@Override
	protected void startService() {
// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "");

	}

	@Override
	protected void stopService() {
// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
// TODO Auto-generated method stub

//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}
