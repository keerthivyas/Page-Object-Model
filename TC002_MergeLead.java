package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC002_MergeLead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		
      excelFileName = "TC002";
	}
	
	
	@Test(dataProvider = "ArrayData")
	public void tc002_MergeLead(String username, String password, String fromFName, String toFName) throws InterruptedException {
		
		
		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickCRM()
		.clickLeadsTab().clickonMergeLead().fromLead().findLeads(fromFName).toLead().findLeads(toFName)
		.clickMerge().acceptAlert().getTitle();

	}

}
