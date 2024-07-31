package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excel_testdata {
	
static public WebDriver dr;
	
	static public String read_excel(int x,int y)
	{
		File f = new File("Luma_testdata.xlsx");
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		try {
			fis = new FileInputStream(f);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		XSSFRow r = sh.getRow(x);
		XSSFCell c = r.getCell(y);
		
		String str = c.getStringCellValue();
		
		return str;
		
	}

}
