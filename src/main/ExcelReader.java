package main;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    public static void main(String args[]) throws IOException {
//obtaining input bytes from a file

        int $_$;

        FileInputStream fis=new FileInputStream("C:\\Users\\nevka\\Desktop\\IfscCodes.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
        Iterator<Row> itr
                = sheet.iterator();    //iterating over excel file
            List<Bank> bankList = new ArrayList<>();

        while (itr.hasNext())
        {
            Bank bank = new Bank();
            Row row = itr.next();
            boolean flag = false;
            for(int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++){
                Cell cell = row.getCell(j);
                if(cell != null && cell.getStringCellValue()!= null && cell.getStringCellValue().equals("IfscCode")){
                    flag = true;
                    break;
                }
                if(j==0){
                    bank.setIfscCode(cell.getStringCellValue());
                }
                if(j == 1 ){
                    bank.setBankName(cell.getStringCellValue());
                }
                if (j == 2 ){
                    bank.setCity(cell.getStringCellValue());
                }
            }
            if (!flag) {
                bankList.add(bank);
            }

        }
            System.out.println(bankList);
    }



}
