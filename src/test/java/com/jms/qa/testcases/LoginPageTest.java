package com.jms.qa.testcases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jms.qa.base.TestBase;
import com.jms.qa.pages.HomePage;
import com.jms.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
	
		loginPage = new LoginPage();
		
		
		
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title =loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "");
	}
	
	@Test(priority=2)
	public void jmsLogoImageTest()
	{
		boolean flag =loginPage.validateJMSImage();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=3)
	public void loginTest() throws Exception
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Microsoft')]")).click();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
