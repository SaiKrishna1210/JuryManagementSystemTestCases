package com.jms.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jms.qa.base.TestBase;
import com.jms.qa.pages.EventsPage;
import com.jms.qa.pages.HomePage;
import com.jms.qa.pages.JurorDetails;
import com.jms.qa.pages.JurorProfile;
import com.jms.qa.pages.LoginPage;
import com.jms.qa.util.TestUtil;

public class JurorProfileTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	JurorProfile jurorProfile;
	EventsPage eventsPage;
	JurorDetails jurorDetails;
	
	
	String sheetName="JurorDetails";
	
	
	public JurorProfileTest()
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
		jurorProfile= homePage.searchJurorText();
		
		
	}
	
	
//	@Test(priority=1)
//	public void clickOnJurorProfileButtonTest() throws InterruptedException {
//		
//		jurorDetails=jurorProfile.clickJurorProfileButton();
//		
//		
//	}
	
//	@Test
//	public void clickJurorProfileButtonDynamicallyTest()
//	{
//		jurorProfile.clickJurorProfileButtonDynamically("YICHU          ");
//	}
	
	@DataProvider
	public Object[][] getJMSTestData() throws Exception
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
	
	
	@Test(priority=2,dataProvider="getJMSTestData")
	public void validateclickOnEditDetails(String hPhn,String wPhn,String emailData) throws Exception
	{
		jurorDetails=jurorProfile.clickJurorProfileButton();
		Thread.sleep(5000);
		
		
		//jurorDetails.editJurorDetails("121-261-4264", "121-261-42641", "abctest@gmail.com");
		jurorDetails.editJurorDetails(hPhn, wPhn, emailData);
	
		Thread.sleep(2000);
		
	}

	
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
