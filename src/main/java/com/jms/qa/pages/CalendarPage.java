package com.jms.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.base.TestBase;

public class CalendarPage extends TestBase {
	
	@FindBy(xpath="//button[text()='Create event']")
	WebElement createNewEvent;
	
	
	@FindBy(xpath="//input[@name='title']")
	WebElement titleLabel;
	
	@FindBy(xpath="//input[@id='startdate']")
	WebElement trialDate;
	
	@FindBy(xpath="//input[@id='starttime']")
	WebElement startTime;
	
	@FindBy(xpath="//input[@id='endtime']")
	WebElement endTime;
	
	@FindBy(xpath="//input[@ng-model='$parent.judgename']")
	WebElement judgeName;
	
	@FindBy(xpath="//input[@ng-model='$parent.caseno']")
	WebElement caseNumber;
	
	
	@FindBy(xpath="//input[@ng-model='$parent.room']")
	WebElement roomNumber;
	
	@FindBy(xpath="//input[@ng-model='$parent.defendant']")
	WebElement defendant;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement saveBtn;
	
	
	@FindBy(xpath="//h4[text()='Create Event']")
	WebElement createEventLabel;
	
	
	
	
	public CalendarPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonCreateNewEventAutomate() throws InterruptedException
	{
		createNewEvent.click();
		
		Thread.sleep(2000);
		
	}
	
	public boolean verifyCreateEventLabel() 
	{
		return createEventLabel.isDisplayed();
	}
	
	
	public void createNewEvent(String titl,String trDate,String stTime,String enTime,String judName,String cNumber,String rNumber,String defendantName) throws Exception
	{
		titleLabel.clear();
		
		titleLabel.sendKeys(titl);
		Thread.sleep(3000);
		
		trialDate.sendKeys(trDate);
		Thread.sleep(3000);
		
		
		startTime.sendKeys(stTime);
		Thread.sleep(3000);
		
	
		endTime.sendKeys(enTime);
		Thread.sleep(3000);
	
		judgeName.clear();
		judgeName.sendKeys(judName);
		Thread.sleep(3000);
		
	
	
		caseNumber.clear();
		caseNumber.sendKeys(cNumber);
		
		Thread.sleep(3000);
		
		roomNumber.clear();
		roomNumber.sendKeys(rNumber);
		Thread.sleep(3000);
		
		defendant.clear();
		
		defendant.sendKeys(defendantName);
		saveBtn.click();
		
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


}
