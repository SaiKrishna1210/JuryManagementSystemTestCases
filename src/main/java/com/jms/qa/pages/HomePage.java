package com.jms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//li[contains(text(),'Hello, testcodesmart@outlook.com')]")
	WebElement userNameLabel;
	
	
	@FindBy(xpath="//input[@id='JurorSearch']") 
	WebElement jurorSearchLabel;
	
	@FindBy(xpath="//button[@type='submit']")
	
	WebElement searchJurorBtn;
	
	@FindBy(xpath="//input[@id='EventSearch']")
	WebElement eventSearchLabel;
	
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchEvent;
	
	
	@FindBy(xpath="//p[@title='Calendar']")
	WebElement eventCalendar;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public JurorProfile searchJurorText() throws Exception
	{
		jurorSearchLabel.sendKeys("REN");
		Thread.sleep(1000);
		searchJurorBtn.click();
		Thread.sleep(3000);
		return new JurorProfile();
		
		
	}
	
	public EventsPage searchEvent() throws InterruptedException
	{
		eventSearchLabel.sendKeys("JMS");
		Thread.sleep(1000);
		searchEvent.click();
		Thread.sleep(3000);
		return new EventsPage();
		
		
		
	}
	
	public CalendarPage clickOnCalendar() throws Exception
	{
		eventCalendar.click();
		Thread.sleep(2000);
		
		return new CalendarPage();
	}
	
	
	

}
