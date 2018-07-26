package com.jms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jms.qa.base.TestBase;

public class EventDetails extends TestBase {
	
	
	
	@FindBy(xpath="//button[@title='View Event']")
	WebElement viewEventbtn;
	
	@FindBy(xpath="//input[@ng-change='selectAll(summonsSelectedFilter)']")
	WebElement selectAllEventsChkBox;
	
	@FindBy(xpath="//button[text()='Print Selected Summons']")
	WebElement printSelectedSummonsbtn;
	
	@FindBy(xpath="//button[text()='Multiple Update Status ']")
	WebElement mutliUpdateStatus;
	
	
	@FindBy(xpath="//td[text()='EDUARDO         PONCE PENARANDA               ']//following-sibling::td//following-sibling::td[text()='106']"
			+ "//following-sibling::td//following-sibling::button[text()=' Update Status']")
	WebElement firstJuror;
	

	
	
     @FindBy(xpath="//td[text()='EDWARD          GANNON                        ']//following-sibling::td//following-sibling::td[text()='106']"
			+ "//following-sibling::td//following-sibling::button[text()=' Update Status']")
	WebElement secondJuror;
	
	@FindBy(xpath="//td[text()='PATRICIA        HANSEN                        ']"
			+ "//following-sibling::td//following-sibling::td[text()='106']//following-sibling::td//following-sibling::button[text()=' Update Status']")
	WebElement thirdJuror;
	
	@FindBy(xpath="//td[text()='PATRICIA        FONSECA                       ']//following-sibling::td//following-sibling::td[text()='106']"
			+ "//following-sibling::td//following-sibling::button[text()=' Update Status']")
	WebElement fourthJuror;

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
	
	
	
	@FindBy(xpath="//button[text()='Move selected to Assinged ']")
	WebElement moveSelectedToAssigned;
	
	@FindBy(xpath="//span[@id='active3']")
	WebElement assignedBtn;
	
	
	
	@FindBy(xpath="//span[@id='select_all_assigned']")
	WebElement assignedSelectAll;
	
	@FindBy(xpath="//button[text()='Move selected To Panel ']")
	WebElement moveSelectedToPanel;
	
	@FindBy(xpath="//span[@id='active4']")
	WebElement panelBtn;
	
	@FindBy(xpath="//td[text()='EDUARDO         PONCE PENARANDA               ']//following-sibling::td"
			+ "//following-sibling::button//following-sibling::button[text()='Pay']")
	WebElement firstJurorPay;
	
	@FindBy(xpath="//td[text()='EDWARD          GANNON                        ']//following-sibling::td"
			+ "//following-sibling::button//following-sibling::button[text()='Pay']")
	WebElement secondJurorPay;
	
	@FindBy(xpath="//td[text()='PATRICIA        HANSEN                        ']//following-sibling::td"
			+ "//following-sibling::button//following-sibling::button[text()='Pay']")
	WebElement thirdJurorPay;
	
	@FindBy(xpath="//td[text()='PATRICIA        FONSECA                       ']//following-sibling::td"
			+ "//following-sibling::button//following-sibling::button[text()='Pay']")
	WebElement fourthJurorPay;
	
	@FindBy(xpath="//button[text()='---Payment Methods--- ']")
	WebElement paymentButton;
	
	@FindBy(xpath="//a[text()='Pay Full Amount ']")
	WebElement firstPaymentMethod;
	
	@FindBy(xpath="//a[text()='Donate Full Amount  ']")
	WebElement secondPaymentMethod;
	
	@FindBy(xpath="//a[text()='Pay Daily Amount']")
	WebElement thirdPaymentMethod;
	
	@FindBy(xpath="//a[text()='Pay Miles Amount ']")
	WebElement fourthPaymentMethod;
	
	
	
	public EventDetails()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public  void movejurorsToPanel() throws Exception
	{
		viewEventbtn.click();
		Thread.sleep(3000);
		selectAllEventsChkBox.click();
		Thread.sleep(3000);
		printSelectedSummonsbtn.click();
		Thread.sleep(3000);
		mutliUpdateStatus.click();
		Thread.sleep(3000);
		
		firstJuror.click();
		Thread.sleep(3000);
		homePhnBtn.sendKeys("11111111111");
		Thread.sleep(3000);
		jurorDetailsSaveBtn.click();
		Thread.sleep(3000);
		jurorDetailsConfBtn.click();
		Thread.sleep(3000);
		
		secondJuror.click();
		homePhnBtn.sendKeys("222222222222");
		Thread.sleep(3000);
		jurorDetailsSaveBtn.click();
		Thread.sleep(3000);
		jurorDetailsConfBtn.click();
		Thread.sleep(3000);
		
		thirdJuror.click();
		homePhnBtn.sendKeys("333333333333");
		Thread.sleep(3000);
		jurorDetailsSaveBtn.click();
		Thread.sleep(3000);
		jurorDetailsConfBtn.click();
		Thread.sleep(3000);
		
		fourthJuror.click();
		homePhnBtn.sendKeys("44444444444");
		Thread.sleep(3000);
		jurorDetailsSaveBtn.click();
		Thread.sleep(3000);
		jurorDetailsConfBtn.click();
		Thread.sleep(3000);
		
		potentialBtn.click();
		Thread.sleep(5000);
		potentialSelectAll.click();
		Thread.sleep(3000);
		moveSelectedToAssigned.click();
		Thread.sleep(3000);
		assignedBtn.click();
		Thread.sleep(3000);
		assignedSelectAll.click();
		Thread.sleep(3000);
		moveSelectedToPanel.click();
		Thread.sleep(3000);
		panelBtn.click();
	    Thread.sleep(3000);
	    
	    firstJurorPay.click();
	    Thread.sleep(3000);
	    paymentButton.click();
	    Thread.sleep(9000);
	    firstPaymentMethod.click();
	    Thread.sleep(7000);
	    
	    secondJurorPay.click();
	    Thread.sleep(3000);
	    paymentButton.click();
	    Thread.sleep(9000);
	    secondPaymentMethod.click();
	    Thread.sleep(7000);
	    
	    thirdJurorPay.click();
	    Thread.sleep(3000);
	    paymentButton.click();
	    Thread.sleep(9000);
	    thirdPaymentMethod.click();
	    Thread.sleep(7000);
	    
	    fourthJurorPay.click();
	    Thread.sleep(3000);
	    paymentButton.click();
	    Thread.sleep(9000);
	    fourthPaymentMethod.click();
	    Thread.sleep(7000);
	    
	    
	    
	    

	    
	  
		
		
		
		
	}
	
	
	
	
		
	}


