package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	public CreateLeadPage enterFname(String data) {
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(data);
		return this;
		

	}
	
	public CreateLeadPage enterLname(String data) {
		
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(data);
		return this;

	}
	
	public CreateLeadPage enterCname(String data) {
      
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(data);	
		return this;

	}
	
	public ViewLeadPage createLead() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		return new ViewLeadPage();

	}

}
