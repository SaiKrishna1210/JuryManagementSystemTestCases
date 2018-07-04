package com.jms.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jms.qa.base.TestBase;
import com.jms.qa.pages.CalendarPage;
import com.jms.qa.pages.EventsPage;
import com.jms.qa.pages.HomePage;
import com.jms.qa.pages.JurorDetails;
import com.jms.qa.pages.JurorProfile;
import com.jms.qa.pages.LoginPage;
import com.jms.qa.util.TestUtil;

public class CalendarPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	JurorProfile jurorProfile;
	EventsPage eventsPage;
	JurorDetails jurorDetails;
	CalendarPage calendarPage;
	
	
	String sheetName="EventDetails2";
	

	public CalendarPageTest()
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
		jurorDetails = new JurorDetails();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Microsoft')]")).click();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		calendarPage=homePage.clickOnCalendar();
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-info ng-scope']")).click();
		Thread.sleep(1000);
				
		
		
		
		
		
	}
	
	
	@Test
	public void verifyCreateEventLabelTest()
	{		
		boolean flag =calendarPage.verifyCreateEventLabel();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@DataProvider
	public Object[][] getJMSTestData() throws Exception
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
	
	@Test(priority=2,dataProvider="getJMSTestData")
	public void validateclickOnEditDetails(String tit,String triDate,String strTime,String enddTime,String jName,String cNum,String rNum,String dName) throws Exception
	{
		
		
		calendarPage.createNewEvent(tit, triDate, strTime, enddTime, jName, cNum, rNum, dName);
		
	
		Thread.sleep(2000);
		
	}

	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
