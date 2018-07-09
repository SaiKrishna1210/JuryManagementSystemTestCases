package com.jms.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jms.qa.base.TestBase;
import com.jms.qa.pages.EventDetails;
import com.jms.qa.pages.EventsPage;
import com.jms.qa.pages.HomePage;
import com.jms.qa.pages.JurorDetails;
import com.jms.qa.pages.JurorProfile;
import com.jms.qa.pages.LoginPage;

public class EventsPagetest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	JurorProfile jurorProfile;
	EventsPage eventsPage;
	JurorDetails jurorDetails;
	EventDetails eventDetails;
	
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
	
		loginPage = new LoginPage();
		jurorProfile = new JurorProfile();
		eventsPage = new EventsPage();
		jurorDetails = new JurorDetails();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Microsoft')]")).click();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		eventsPage=homePage.searchEvent();
		Thread.sleep(3000);
		
		
		
		
	}
	
	@Test(priority=1)
	public void viewEventFlowTest() throws Exception
	{
		eventDetails=eventsPage.viewEventFlow();
	}
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
