package com.jms.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jms.qa.base.TestBase;
import com.jms.qa.pages.CalendarPage;
import com.jms.qa.pages.EventsPage;
import com.jms.qa.pages.HomePage;
import com.jms.qa.pages.JurorProfile;
import com.jms.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	JurorProfile jurorProfile;
	EventsPage eventsPage;
	CalendarPage calendarPage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
	
		loginPage = new LoginPage();
		jurorProfile = new JurorProfile();
		eventsPage = new EventsPage();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Microsoft')]")).click();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifySearchJurorTest() throws Exception
	{
		jurorProfile=homePage.searchJurorText();
	}
	
	@Test(priority=4)
	public void verifySearchEventTest() throws Exception
	{
		eventsPage=homePage.searchEvent();
	}
	
	@Test(priority=5)
	public void clickOnCalendarTest() throws Exception
	{
		calendarPage=homePage.clickOnCalendar();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	


}
