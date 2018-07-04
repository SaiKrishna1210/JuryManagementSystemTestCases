package com.jms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.base.TestBase;

public class JurorDetails extends TestBase{
	
	@FindBy(xpath="//a[text()='Edit Details']")
	WebElement editDetailsLink;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement workPhNumber;
	
	@FindBy(xpath="//input[@name='work']")
	WebElement homePhNumber;
	
	
	@FindBy(xpath="//input[@id='emailvalidate']")
	WebElement emailValidation;
	
	@FindBy(xpath="//a[text()='Save Details']")
	WebElement saveDetailsLink;
	
	
	public JurorDetails()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void editJurorDetails(String wphNumber,String hphNumber,String emailVal ) throws Exception
	{
		editDetailsLink.click();
		Thread.sleep(3000);
		workPhNumber.clear();
		workPhNumber.sendKeys(wphNumber);
		homePhNumber.clear();
		homePhNumber.sendKeys(hphNumber);
		emailValidation.clear();
		emailValidation.sendKeys(emailVal);
		
		Thread.sleep(3000);
		saveDetailsLink.click();
		
		
		
	}












}

