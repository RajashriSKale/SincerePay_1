package com.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pom.CreditCard;
import com.Pom.DMTLogin;
import com.Pom.DashBoardLogin;
import com.Pom.LoginPage;
import com.utility.excelsheet;
import com.utility.screenshot;

public class TestClass extends BaseClass {
WebDriver driver;
@BeforeTest
public void LaunchBrowser()  {
	driver=BaseClass.launchbrowser();
	driver.get("https://www.sincerepay.co.in/Login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,100)");
}

@Test(priority=0)
public void VerifyLoginPage() throws EncryptedDocumentException, IOException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	LoginPage LP1=new LoginPage(driver);
	/*LP1.USERNAME();
	LP1.PASSWORD();
	LP1.LOGINBUTTON();*/
	String user =excelsheet.getdataProviderExcelSheet(2, 2);
	LP1.USERNAME(user);
	String password=excelsheet.getdataProviderExcelSheet(3, 2);
	LP1.PASSWORD(password);
	LP1.LOGINBUTTON();
}


@Test(priority=1)
public void verifyCreditCard() throws InterruptedException {
	CreditCard cd=new CreditCard(driver);
	cd.Creditcardclick();
	//cd.MasterCard();
	cd.NETWORK();
	 Actions c=new Actions(driver);
     for(int i=1;i<=2;i++) {
         c.sendKeys(Keys.ARROW_DOWN).build().perform();}
     c.sendKeys(Keys.ENTER).build().perform();
     
    
	cd.Cardholdername();
	cd.cardname();
	cd.Mobno();
	cd.Amount();
	cd.PIN();
	//cd.Reset();
	cd.Proceed();
	Thread.sleep(2000);
	cd.YES();
	cd.DASHBOARD();
}

@AfterMethod()

public void FailScreenshot(ITestResult result) throws IOException {
	/*if(ITestResult.SUCCESS==result.getStatus()) {
	screenshot.getscreenshot(driver);
	
	}else */{
		if(ITestResult.FAILURE==result.getStatus()) {
			System.out.print("FailScreenshot");
		}
	}
}


@Test(priority=2)
	public void VerifyDashBoardLogin() {
	DashBoardLogin DB=new DashBoardLogin(driver);
	
		DB.PREPAID();
	    DB.SELECTOPERATOR();
	    Actions ac= new Actions(driver);
	    for(int i=2;i<=4;i++) {
	    		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
	    		}
	    		ac.sendKeys(Keys.ENTER).build().perform();
	    		
		DB.DROPDOWN();
	    DB.CONSNUM();
		DB.AMOUNT();
	    DB.PLAN();
		
}
@Test(priority=3)
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

	
}
