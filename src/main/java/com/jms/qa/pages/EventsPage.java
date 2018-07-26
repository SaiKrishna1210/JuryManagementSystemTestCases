package com.jms.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.base.TestBase;

public class EventsPage extends TestBase{
	

	
	@FindBy(xpath="//button[@title='View Event']")
	WebElement viewEventbtn;
	
	@FindBy(xpath="//button[text()='Request Jurors']")
	WebElement reqJurorsbtn;
	
	@FindBy(xpath="//input[@ng-change='selectAll(summonsSelectedFilter)']")
	WebElement selectAllEventsChkBox;
	
	@FindBy(xpath="//button[text()='Print Selected Summons']")
	WebElement printSelectedSummonsbtn;
	
	@FindBy(xpath="//button[text()='Multiple Update Status ']")
	WebElement mutliUpdateStatus;
	
	@FindBy(xpath="//td[text()='MARK            PONTE                         ']"
			+ "//following-sibling::td//following-sibling::td"
			+ "//following-sibling::td//following-sibling::td"
			+ "//following-sibling::td//following-sibling::td"
			+ "//following-sibling::td//following-sibling::button"
			+ "//following-sibling::button[text()=' Update Status']")
	WebElement singleUpdateStatusBtn;
	
	
	@FindBy(xpath="//input[@id='homephone']")
	WebElement homePhnBtn;
	
	
	@FindBy(xpath="//button[@type='submit' and text()='Save']")
	WebElement jurorDetailsSaveBtn;
	
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement jurorDetailsConfBtn;
	
	@FindBy(xpath="//span[@id='active2']")
	WebElement potentialBtn;
	
	@FindBy(xpath="//span[@id='select_all_potential']")
	WebElement potentialSelectAll;
	
	@FindBy(xpath="//button[text()='Assign To Event ']")
	WebElement assignToEventBtn;
	
	@FindBy(xpath="//span[@id='active3']")
	WebElement assignedBtn;
	
	@FindBy(xpath="//span[@id='select_all_assigned']")
	WebElement assignedSelectAll;
	
	
	@FindBy(xpath="//button[text()='Move selected To Panel ']")
	WebElement moveSelectedToPanel;
	
	
	public EventsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public EventDetails viewEventFlow() throws Exception
	{
		viewEventbtn.click();
		Thread.sleep(3000);
		//reqJurorsbtn.click();
		//Thread.sleep(3000);
		selectAllEventsChkBox.click();
		Thread.sleep(3000);
		printSelectedSummonsbtn.click();
		Thread.sleep(3000);
		mutliUpdateStatus.click();
		Thread.sleep(3000);
		singleUpdateStatusBtn.click();
		homePhnBtn.sendKeys("1234567891");
		Thread.sleep(3000);
		jurorDetailsSaveBtn.click();
		Thread.sleep(3000);
		jurorDetailsConfBtn.click();
		Thread.sleep(3000);
		potentialBtn.click();
		Thread.sleep(3000);
		potentialSelectAll.click();
		Thread.sleep(3000);
		assignToEventBtn.click();
		Thread.sleep(3000);
		assignedBtn.click();
		Thread.sleep(3000);
		assignedSelectAll.click();
		Thread.sleep(3000);
		moveSelectedToPanel.click();
		Thread.sleep(3000);
		return new EventDetails();
		
		
		
		
		
		
	}
	
	
	
	

}
