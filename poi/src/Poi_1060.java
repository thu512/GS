import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * @과목명           : GS ITM 인턴사원 자바교육
 * @FileName        : Poi_1060.java
 * @Project         : Poi
 * @Date            : 2018. 4. 4.
 * @작성자          : 이창주
 * @프로그램 설명   : Poi라이브러리 과제
 */
public class Poi_1060 {
    static HSSFRow row;
    static HSSFCell cell;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //엑셀파일생성
        HSSFWorkbook workbook = new HSSFWorkbook();
        //시트를 만든다. 시트이름: mySheet
        HSSFSheet sheet1 = workbook.createSheet("프로젝트 기본정보 및 확인내역");

        //폰트 볼드체
        Font font = workbook.createFont();
        font.setBold(true);

        //노랑배경, 태두리, 글자 가운대 정렬, 폰트
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(HSSFColor.YELLOW.index);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setFont(font);

        //태두리, 글자 가운대 정렬, 폰트
        CellStyle boarder = workbook.createCellStyle();
        boarder.setBorderRight(BorderStyle.THIN);
        boarder.setBorderBottom(BorderStyle.THIN);
        boarder.setBorderTop(BorderStyle.THIN);
        boarder.setBorderLeft(BorderStyle.THIN);
        boarder.setVerticalAlignment(VerticalAlignment.CENTER);
        boarder.setFont(font);

        //1번 행
        row = sheet1.createRow(0);
        row.setHeight((short)400);
        //A
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("프로젝트명");
        //B
        cell = row.createCell(1);
        cell.setCellStyle(boarder);
        //C
        cell = row.createCell(2);
        cell.setCellStyle(style);
        cell.setCellValue("프로젝트 규모");
        //D
        cell = row.createCell(3);
        cell.setCellStyle(boarder);

        //2번행
        row = sheet1.createRow(1);
        row.setHeight((short)400);
        //A
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("작성자");
        //B
        cell = row.createCell(1);
        cell.setCellStyle(boarder);
        //C
        cell = row.createCell(2);
        cell.setCellStyle(style);
        cell.setCellValue("작성일");
        //D
        cell = row.createCell(3);
        cell.setCellStyle(boarder);

        //3번행
        row = sheet1.createRow(2);
        row.setHeight((short)1400);
        //A
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("프로젝트 제약사항");
        //B, C, D 생성후 병합
        for (int i = 1; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }
        sheet1.addMergedRegion(new CellRangeAddress(2, 2, 1, 3));

        //4번행
        row = sheet1.createRow(3);
        row.setHeight((short)120);
        //A, B, C, D 셀 생성
        for (int i = 0; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }

        //5번행
        row = sheet1.createRow(4);
        row.setHeight((short)400);
        //A 5,6행병합
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("확인");
        sheet1.addMergedRegion(new CellRangeAddress(4, 5, 0, 0));
        //B
        cell = row.createCell(1);
        cell.setCellValue("프로젝트 QA :                                                         (서명)                            (일자)");
        cell.setCellStyle(boarder);
        //C, D 셀 병합
        for (int i = 2; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }
        sheet1.addMergedRegion(new CellRangeAddress(4, 4, 1, 3));

        //6번행
        row = sheet1.createRow(5);
        row.setHeight((short)400);
        //A 병합된 빈셀
        cell = row.createCell(0);
        cell.setCellStyle(boarder);
        //B, C, D 셀 병합
        cell = row.createCell(1);
        cell.setCellValue("프로젝트 QA :                                                         (서명)                            (일자)");
        cell.setCellStyle(boarder);
        for (int i = 2; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }
        sheet1.addMergedRegion(new CellRangeAddress(5, 5, 1, 3));

        //7번행
        row = sheet1.createRow(6);
        row.setHeight((short)120);
        //A, B, C, D 셀 생성
        for (int i = 0; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }

        //8번행
        row = sheet1.createRow(7);
        row.setHeight((short)1400);
        //A
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("검토의견");
        //B, C, D 셀병합
        for (int i = 1; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }
        sheet1.addMergedRegion(new CellRangeAddress(7, 7, 1, 3));

        //9번행
        row = sheet1.createRow(8);
        row.setHeight((short)400);
        //A
        cell = row.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("검토자");
        //B, C, D 셀 병합
        cell = row.createCell(1);
        cell.setCellValue("전사 프로세스 담당자 :                                             (서명)                            (일자)");
        cell.setCellStyle(boarder);
        for (int i = 2; i <4 ; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(boarder);
        }
        sheet1.addMergedRegion(new CellRangeAddress(8, 8, 1, 3));

        //셀 너비 설정
        for (int i = 0; i <4 ; i++) {
            sheet1.autoSizeColumn(i);
        }
        sheet1.setColumnWidth(0, (sheet1.getColumnWidth(0))+(short)2000);
        sheet1.setColumnWidth(1, (sheet1.getColumnWidth(0))+(short)4000);
        sheet1.setColumnWidth(2, (sheet1.getColumnWidth(0))+(short)2000);
        sheet1.setColumnWidth(3, (sheet1.getColumnWidth(0))+(short)4000);

        //파일 출력 스트림
        FileOutputStream outFile;

        try {
            outFile = new FileOutputStream("/Users/lcj/Desktop/xlsWrite.xls");
            workbook.write(outFile);
            outFile.close();
            System.out.println("파일생성완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
