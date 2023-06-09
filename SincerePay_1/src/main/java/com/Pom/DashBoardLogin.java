package com.Pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 


public class DashBoardLogin {
	
@FindBy(xpath="(//div[@class='dashrechargepanel']//div)[3]")
private WebElement Prepaid;
@FindBy(xpath="//div[@class='jss25672 jss25673']")
private WebElement SelectOperator;
@FindBy (id="OperatorID")
private WebElement DropDown;
@FindBy(xpath="//input[@aria-invalid='true']")
private WebElement ConsumerNumber;
@FindBy(xpath="//input[@aria-invalid='false']")
private WebElement Amount;
@FindBy(xpath="//span[@class='MuiButton-label-17207']")
private WebElement Plan;


public DashBoardLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
}

public void PREPAID() {
	Prepaid.click();
	
}
public void SELECTOPERATOR() {
	SelectOperator.click();
}
public void DROPDOWN() {
   DropDown.click();
}
public void CONSNUM() {
	ConsumerNumber.sendKeys("1234567890");
}
public void AMOUNT() {
	Amount.sendKeys("2345");
}
public void PLAN() {
	Plan.click();
}
}
