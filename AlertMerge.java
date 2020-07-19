package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class AlertMerge extends ProjectSpecificMethod{
	
	public ViewLeadPage acceptAlert() {
		
		driver.switchTo().alert().accept();
		
		return new ViewLeadPage();

	}

     public ViewLeadPage dismissAlert() {
		
		driver.switchTo().alert().dismiss();
		
		return new ViewLeadPage();

	}
	
}
