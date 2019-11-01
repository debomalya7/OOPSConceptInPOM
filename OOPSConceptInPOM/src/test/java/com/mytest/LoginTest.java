package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLoginPageTitletest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority = 2)
	public void verifyLoginPageHeadertest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}

}
