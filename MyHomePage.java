package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	public MyLeadsPage clickLeadsTab() {
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadsPage();

	}

}
