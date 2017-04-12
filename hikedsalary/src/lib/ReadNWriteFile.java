package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadNWriteFile {
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh1;

	public static void main(String[] args)
	{
			try
			{
				//Specify the file path
				File src = new File("D:\\PersonalSpace\\MySelenium\\read_from_file.xlsx");
				
				//Load file
				fis = new FileInputStream(src);
				
				//Load workbook
				wb = new XSSFWorkbook(fis);
				
				//Select spreadsheet
				sh1 = wb.getSheetAt(0);
				
				 System.out.println("R0C0: " + sh1.getRow(0).getCell(0).getStringCellValue());
				 System.out.println("R0C1: " + sh1.getRow(0).getCell(1).getStringCellValue());
				 System.out.println("R1C0: " + sh1.getRow(1).getCell(0).getStringCellValue());
				 System.out.println("R1C1: " + sh1.getRow(1).getCell(1).getStringCellValue());
				 
				 sh1.getRow(0).createCell(2).setCellValue("Data");
				 sh1.getRow(1).createCell(2).setCellValue("is");
				 sh1.getRow(2).createCell(2).setCellValue("written");
				 				 
				// here we need to specify where you want to save file
				FileOutputStream fout=new FileOutputStream(new File("D:\\PersonalSpace\\MySelenium\\write_to_file.xlsx"));
				 
				// finally write content 
				wb.write(fout);
				 
				// close the file
				fout.close();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
	

}
