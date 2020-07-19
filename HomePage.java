package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public MyHomePage clickCRM() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();

	}

}
