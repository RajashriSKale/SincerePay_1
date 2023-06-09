package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prepaid {
	@FindBy(xpath="//div[@class='jss521 jss522']")
	private WebElement Prepaid1;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement ConsumerNo;
	
	@FindBy(xpath="//div[@id='OperatorID']")
	private WebElement SelectOperator;
	
	@FindBy(xpath="//li[@data-value='14']")
	private WebElement Airtel;
	
	@FindBy(xpath="//input[@aria-invalid='true']")
	private WebElement Amount;
	
	@FindBy(xpath="//span[@class='MuiButton-label-495'][1]")
	private WebElement Plan;
	
	@FindBy(xpath="//span[@class='MuiButton-label-495']")
	private WebElement Offer;

	public Prepaid(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	public void PREPAID() {
		Prepaid1.click();
	}

	public void SELECTOPERATOR() {
		SelectOperator.click();
	}
	
	public void AIRTEL1() {
	    Airtel.click();
	    }
	
	public void CONSUMERNUNBER() {
		ConsumerNo.sendKeys("6545635435");
	}
	public void AMOUNT() {
		Amount.sendKeys("5000");
	}
	public void PLAN() {
		Plan.click();
	}
	public void OFFER() {
		Offer.click();
	}

		
}
