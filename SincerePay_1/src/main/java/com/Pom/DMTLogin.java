package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DMTLogin {
	
	
@FindBy(xpath="//input[@aria-invalid='true']")
private WebElement DMT;

@FindBy(xpath="//input[@name='Mobile']")
private WebElement Mobnum;

@FindBy(xpath="//input[@name='Name']")
private WebElement ConName;

@FindBy(xpath="//span[@class='MuiButton-label-38756'][1]")
private WebElement Search;

@FindBy(xpath="//input[@aria-invalid='false'][1]")
private WebElement Name;

@FindBy(xpath="//input[@aria-invalid='false']")
private WebElement RemLimit;

@FindBy(xpath="//input[@name='Consumed']")
private WebElement Consumed;

@FindBy(xpath="//input[@class='MuiInputBase-input-40530 MuiInput-input-40518']")
private WebElement Searching;

public DMTLogin(WebDriver driver){
	PageFactory.initElements(driver, this);
	
}
public void DMTClick(){
	DMT.click();
	
}
public void MOBNUMBER() {
	Mobnum.sendKeys("8983537692");

}
public void CONSUMERNAME() {
	ConName.sendKeys("Babaji");
}
public void SEARCH() {
	Search.click();
}
public void NAME() {
	Name.sendKeys("Babaji");
}
public void REMAININGLIMIT() {
	RemLimit.sendKeys("2345");
}
public void CONSUME() {
	Consumed.click();
}
public void SEARCHING() {
Searching.click();
}
}
