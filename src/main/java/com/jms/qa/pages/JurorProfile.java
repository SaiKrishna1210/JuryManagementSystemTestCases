package com.jms.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jms.qa.base.TestBase;

public class JurorProfile extends TestBase {
	
//	@FindBy(xpath="//button[@title='Juror Details']//parent::"
//			+ "td//parent::tr[@class='ng-scope']//preceding-sibling::td[text()='REN568' ]")
//	WebElement jurorProfileBtn;
	
	@FindBy(xpath="//td[text()='YICHU          '] //following-sibling::td[text()='Jun 5, 2018, 2:38 AM']//following-sibling::td[text()='Summons Not Issued']"
			+ "//following-sibling::td//following-sibling::button[@title='Juror Details']")
	WebElement jurorProfileBtn;
	
	
	
	@FindBy(xpath="//div[@class='container col-sm-12 ng-scope']"
			+ "//preceding-sibling::h3[text()='Juror Profile']")
	WebElement jurorProfileLabel;
	
	public JurorProfile()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public JurorDetails clickJurorProfileButton() throws InterruptedException
	{
		jurorProfileBtn.click();
		Thread.sleep(5000);
		return new JurorDetails();
	}
	
	
//	public void clickJurorProfileButtonDynamically(String name)
//	{
//		driver.findElement(By.xpath("//td[text()='"+name+"'] //following-sibling::"
//				+ "td[text()='Jun 5, 2018, 2:38 AM']//following-sibling::td[text()='Summons Not Issued']"
//				+ "//following-sibling::td//following-sibling::button[@title='Juror Details']")).click();
//	}

}
