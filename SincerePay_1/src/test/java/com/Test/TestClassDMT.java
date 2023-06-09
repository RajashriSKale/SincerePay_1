package com.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pom.DMTLogin;
import com.Pom.LoginPage;
import com.Pom.Prepaid;
import com.utility.excelsheet;

public class TestClassDMT extends BaseClass{
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser()  {
		driver=BaseClass.launchbrowser();
		driver.get("https://www.sincerepay.co.in/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority=0)
	public void VerifyLoginPage() throws EncryptedDocumentException, IOException {
		LoginPage LP1=new LoginPage(driver);
		String user =excelsheet.getdataProviderExcelSheet(2, 2);
		LP1.USERNAME(user);
		String password=excelsheet.getdataProviderExcelSheet(3, 2);
		LP1.PASSWORD(password);
		LP1.LOGINBUTTON();
		
	}
		    
	
	
	@Test(priority=2)
	public void verifyDMTLogin()
	{
		DMTLogin d=new DMTLogin(driver);
		d.DMTClick();
		d.MOBNUMBER();
		d.CONSUMERNAME();
		d.SEARCH();
		d.NAME();
		d.REMAININGLIMIT();
		d.CONSUME();
		d.SEARCHING();
	      
	}
     @Test(priority=1)
      public void verifyPrepaid() {
      Prepaid p=new Prepaid(driver);
      p.PREPAID();
      p.CONSUMERNUNBER();
      p.SELECTOPERATOR();
      Actions c=new Actions(driver);
      for(int i=4;i<=5;i++) {
          c.sendKeys(Keys.ARROW_DOWN).build().perform();}
      
      c.sendKeys(Keys.ENTER).build().perform();
      p.AMOUNT();
      p.PLAN();
      p.OFFER();
}
}
