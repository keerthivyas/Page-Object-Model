package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC001_CreateLead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		
      excelFileName = "TC001";
	}
	
	
	@Test(dataProvider = "ArrayData")
	public void runCreateLead(String username, String password, String cName, String fName, String lName) {
		
		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickCRM().clickLeadsTab()
		.clickonCreateLead().enterCname(cName).enterFname(fName).enterLname(lName).createLead().getTitle();
		
		//another way to declare LoginPage page = new LoginPage();  page.LoginPage().enterUsername();
		

	}

}
