package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCard {
@FindBy(xpath="//div[@class='jss806 jss807']")
private WebElement CreditCard;
//@FindBy(xpath="//li[@aria-disabled='false']")
//private WebElement MasterCard;
@FindBy(xpath="//div[@id='OperatorID']")
private WebElement Network;
@FindBy(name="Name")
private WebElement Cardholdername;
@FindBy(name="CardNumber")
private WebElement CardNumber;
@FindBy(xpath="//input[@name='MobileNumber']")
private WebElement Mobno;
@FindBy(name="Amount")
private WebElement Amount;
@FindBy (name="Pin")
private WebElement pin1;
@FindBy(xpath="//span[@class='MuiButton-label-6774']")
private WebElement Reset;
@FindBy(xpath="//button[@type='submit']")
private WebElement Proceed;
@FindBy(xpath="(//span[@class='MuiButton-label-6774'])[4]")
private WebElement Yes;
@FindBy (xpath = "(//a[@class=\"nav-link\"])[1]")
private WebElement Dashboard;



public CreditCard(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void Creditcardclick() {
	CreditCard.click();
}
//public void MasterCard() {
//	MasterCard.click();
//}
public void NETWORK(){
	Network.click();
}
public void Cardholdername() {
	Cardholdername.sendKeys("abcdefg");
	}
public void cardname() {
	CardNumber.sendKeys("1234567891234567");
}
public void Mobno() {
	Mobno.sendKeys("9823142536");
}
public void Amount() {
	Amount.sendKeys("3421");
}
public void PIN() {
	pin1.sendKeys("4312");
}
public void Reset() {
	Reset.click();
}
public void Proceed() {
	Proceed.click();
}
public void YES() {
	Yes.click();
}
public void DASHBOARD(){
Dashboard.click();
}
}








