package com.leaftaps.pages;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod {
	
	public FindLeadsPage clickPhoneTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;

	}
	
	public FindLeadsPage enterPhoneNumber(String data) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(data);
		return this;

	}
	
	public FindLeadsPage clickFindLeadButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadPage clickonFirstRecord() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLeadPage();

	}
	
}
