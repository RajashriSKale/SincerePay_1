package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {
	
	public static String getdataProviderExcelSheet(int row, int cell) throws EncryptedDocumentException, IOException {

        String data;

    FileInputStream   excel = new FileInputStream("C:/Users/Rqjeshwari/Desktop/SincerePay_1/excelsheet/sincerepay.exelsheet.xlsx");
       Sheet Inputdata  =WorkbookFactory.create(excel).getSheet("Sheet1");

        try {

            data = Inputdata.getRow(row).getCell(cell).getStringCellValue();

        }catch (Exception e) {

            // upcasting to int to long data//

            long intdata = (long)Inputdata.
            		getRow(row).getCell(cell).getNumericCellValue();

            // data

            data = ""+intdata;
        }

        return data;    
	}
	}
    