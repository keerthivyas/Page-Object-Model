package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC003_DeleteLead extends ProjectSpecificMethod{
	
	
	@BeforeTest
	public void setData() {
		
      excelFileName = "TC003";
	}
	
	
	@Test(dataProvider = "ArrayData")
	public void tc002_MergeLead(String username, String password, String phoneNo) throws InterruptedException {
		
		
		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickCRM()
		.clickLeadsTab().clickonFindLead().clickPhoneTab().enterPhoneNumber(phoneNo).clickFindLeadButton()
		.clickonFirstRecord().deleteLead().getTitle();
	}

}
