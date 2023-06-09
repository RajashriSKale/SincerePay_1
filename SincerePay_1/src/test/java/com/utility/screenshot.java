package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	public static void getscreenshot(WebDriver driver) throws IOException {
        Date cd=new Date();
String a=cd.toString().replaceAll(":", "");
        File Sn =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File f = new File("C:/Users/Rqjeshwari/Desktop/SincerePay_1/screenshot/"+a+".jpg");
        FileUtils.copyFile(Sn,f);

}
}