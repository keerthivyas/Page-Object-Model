package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
	public ViewLeadPage getTitle() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		return this;

	}

	
	public MyLeadsPage deleteLead() {
		driver.findElementByLinkText("Delete").click();
		
		return new MyLeadsPage();

	}
	
}
