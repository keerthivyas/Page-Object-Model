package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod {
	
	
	public FindLeadsPopup fromLead() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		return new FindLeadsPopup();

	}
	
	public FindLeadsPopup toLead() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		return new FindLeadsPopup();

	}
	
	public AlertMerge clickMerge() {
		driver.findElementByXPath("//a[text()='Merge']").click();
		return new AlertMerge();
		

	}
	

}
