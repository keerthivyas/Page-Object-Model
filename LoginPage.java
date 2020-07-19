package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
public LoginPage enterUsername(String data) {
	driver.findElement(By.id("username")).sendKeys(data);
	return this;
}
public LoginPage enterPassword(String data) {
	driver.findElement(By.id("password")).sendKeys(data);
	return this;
}

public HomePage clickLogin() {
	
	driver.findElementByClassName("decorativeSubmit").click();
	return new HomePage();

}
}
