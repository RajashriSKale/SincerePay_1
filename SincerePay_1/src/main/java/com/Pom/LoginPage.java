package com.Pom;


import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@aria-invalid='false']")
private WebElement username;
@FindBy(name="Password")
private WebElement pass;
@FindBy(xpath="//span[@class='MuiButton-label-271']")
private WebElement loginbutton;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void USERNAME(String user) {
	username.sendKeys(user);

}

	public void PASSWORD(String password) {
		pass.sendKeys(password);
		
}
	public void LOGINBUTTON() {
	loginbutton.click();
	

	}


}
