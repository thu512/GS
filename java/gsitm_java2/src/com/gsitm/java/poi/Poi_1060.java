package com.gsitm.java.poi;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.util.CellRangeAddress;


public class Poi_1060 {
	static HSSFRow row;
	static HSSFCell cell;
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//엑셀파일생성
			HSSFWorkbook workbook = new HSSFWorkbook();
			//시트를 만든다. 시트이름: mySheet
			HSSFSheet sheet1 = workbook.createSheet("프로젝트 기본정보 및 확인내역");
			HSSFSheet sheet2 = workbook.createSheet("BASE1_WEB(IE) 테일러링 가이드");
			
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(HSSFColor.YELLOW.index);  
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			
			row = sheet1.createRow(0);
			cell  = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue("프로젝트명");
			
			cell  = row.createCell(2);
			cell.setCellStyle(style);
			cell.setCellValue("프로젝트 규모");
			
			row = sheet1.createRow(1);
			cell  = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue("작성자");
			
			cell  = row.createCell(2);
			cell.setCellStyle(style);
			cell.setCellValue("작성일");
			
			row = sheet1.createRow(2);
			cell  = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue("프로젝트 제약사항");
			
			cell  = row.createCell(1);
			sheet1.addMergedRegion(new CellRangeAddress(2, 2, 1, 3));
			
			row = sheet1.createRow(4);
			cell  = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue("확인");
			sheet1.addMergedRegion(new CellRangeAddress(4, 5, 0, 0));
			
			cell  = row.createCell(1);
			cell.setCellValue("프로젝트 QA :                                                         (서명)                            (일자)");
			sheet1.addMergedRegion(new CellRangeAddress(4, 4, 1, 3));
			
			row = sheet1.createRow(5);
			cell  = row.createCell(1);
			cell.setCellValue("프로젝트 QA :                                                         (서명)                            (일자)");
			sheet1.addMergedRegion(new CellRangeAddress(4, 4, 1, 3));
			
			row = sheet1.createRow(7);
			cell  = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue("검토의견");
			
			
			
			
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
