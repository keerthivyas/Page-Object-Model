package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	
	public CreateLeadPage clickonCreateLead() {
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		return new CreateLeadPage();
	}
	
	public MergeLeadPage clickonMergeLead() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();

	}
	
	public FindLeadsPage clickonFindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();

	}
	
	public void getTitle() {
        
		String title = driver.getTitle();
		
		System.out.println(title);
		

	}

}
