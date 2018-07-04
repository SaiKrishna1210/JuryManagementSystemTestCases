package com.jms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.pages.HomePage;
import com.jms.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page factory 
	
	@FindBy(id="i0116") 
	WebElement userName;
	
	@FindBy(id="idSIButton9")
	WebElement userNameNext;
	
	
	@FindBy(id="i0118")
	WebElement passWord;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="html/body/div[2]/div/div[1]/img")
	WebElement jmsLogo;
	
	
	
	
	
	//initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Actions:
	
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
		public boolean validateJMSImage()
		{
			return jmsLogo.isDisplayed();
		}
		
		
		public HomePage login(String un,String pwd) throws Exception
		{
			userName.sendKeys(un);
			
			userNameNext.click();
			Thread.sleep(3000);
			passWord.sendKeys(pwd);
			Thread.sleep(1000);
			loginBtn.click();
			Thread.sleep(3000);
			
			return new HomePage();
		}
	
	
	
}
