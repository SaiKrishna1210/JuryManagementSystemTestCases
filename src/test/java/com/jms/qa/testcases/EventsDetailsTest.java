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


public class EventsDetailsTest extends TestBase {
	
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
		eventDetails = new EventDetails();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Microsoft')]")).click();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		eventsPage=homePage.searchEvent();
		
		Thread.sleep(5000);
		
		
		
		
		
	}
	
	
	
	@Test(priority=1)
	public void moveJurorsToPanelTest() throws Exception
	{
		eventDetails.movejurorsToPanel();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
