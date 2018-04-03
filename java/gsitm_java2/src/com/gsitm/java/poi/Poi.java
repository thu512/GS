package com.gsitm.java.poi;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
public class Poi {
	static HSSFRow row;
	static HSSFCell cell;

	public static void main(String[] args){
		
		//엑셀파일생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		//시트를 만든다. 시트이름: mySheet
		HSSFSheet sheet = workbook.createSheet("mySheet");
		
		//첫번째 row를 만든다.
		row = sheet.createRow(0);
		//1번 라인의 A필드 DATA11을 넣는다.
		row.createCell(0).setCellValue("DATA 11");
		//1번 라인의  B필드 DATA11을 넣는다.
		row.createCell(1).setCellValue("DATA 12");
		row.createCell(2).setCellValue("DATA 13");
		
		//2행
		row = sheet.createRow(1);
		row.createCell(0).setCellValue("DATA 21");
		row.createCell(1).setCellValue("DATA 22");
		row.createCell(2).setCellValue("DATA 23");
		
		//3행
		row = sheet.createRow(2);
		row.createCell(0).setCellValue("DATA 31");
		row.createCell(1).setCellValue("DATA 32");
		row.createCell(2).setCellValue("DATA 33");

		FileOutputStream outFile;

		try {
			outFile = new FileOutputStream("C:\\aa\\xlsWrite.xls");
			workbook.write(outFile);
			outFile.close();			
			
			System.out.println("파일생성완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}