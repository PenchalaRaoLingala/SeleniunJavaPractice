package SamplePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = "src\\test\\resources\\StudentInfo.xlsx";
		String[] valueToWrite = {"Prince","Hyderabad"};
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("StudentDetails");
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		Row row = sheet.getRow(0);
		Row newRow = sheet.createRow(rowcount+1);
		for(int i=0;i<row.getLastCellNum();i++) {
			Cell cell = newRow.createCell(i);
			cell.setCellValue(valueToWrite[i]);
		}
		fis.close();
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		System.out.println("Data written into Excel Successfully");
		fos.close();

	}

}