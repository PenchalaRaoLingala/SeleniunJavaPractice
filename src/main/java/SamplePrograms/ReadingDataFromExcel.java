package SamplePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = "src\\test\\resources\\StudentInfo.xlsx";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("StudentDetails");
		System.out.println(wb.getSheetAt(0).getRow(2).getCell(1));
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		//get a value from a specific cell
		for(int i=0;i<rowcount;i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
			
		}
		
		System.out.println(wb.getSheetAt(0).getRow(1).getCell(0));
		

	}

}
