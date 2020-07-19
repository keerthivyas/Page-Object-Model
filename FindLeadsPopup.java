package com.leaftaps.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FindLeadsPopup extends ProjectSpecificMethod {
	
	public MergeLeadPage findLeads(String data) throws InterruptedException {
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(data);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles.get(0));
		
		return new MergeLeadPage();
	}

}
