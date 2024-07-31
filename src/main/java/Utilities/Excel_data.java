package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data {
	
	public static  List<Map<String,String>> excel_read() throws IOException{
		
		List<Map<String,String>> row_value = new ArrayList<Map<String,String>>();
		
		int lastrownumber;
		
		FileInputStream fis = new FileInputStream("Luma_testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("sheet1");
		lastrownumber = sh.getLastRowNum();
		
		for(int row=0;row<lastrownumber;row++) {
			
			XSSFRow r = sh.getRow(row);
			int lastcellnum = r.getLastCellNum();
			
			LinkedHashMap<String,String> Column_value = new LinkedHashMap<String,String>();
			
			for(int cell=0;cell<lastcellnum;cell++) {
				
				XSSFCell c = r.getCell(cell);
				String Currentcolumnname = sh.getRow(sh.getFirstRowNum()).getCell(cell).getStringCellValue();
				Column_value.put(Currentcolumnname, c.getStringCellValue());
				
			}
			row_value.add(Column_value);
		}
		
		for(int i=0;i<lastrownumber;i++) {
			
			System.out.println(row_value.get(i).get("username") + "  " + row_value.get(i).get("password"));
		}
		
		return row_value;
		
	}

}
