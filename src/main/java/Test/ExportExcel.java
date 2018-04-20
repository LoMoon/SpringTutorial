package main.java.Test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportExcel {
    private static HSSFWorkbook workbook = null;

    public void exportExcel(){
//        List<HospitalConfig> hospitalConfigList =  hospitalConfigService.query();

    }

    public static void main(String[] args) throws java.lang.Exception {
        String[] sheets = {"1","2","3"};
        String[] titleNum = {"7","8","9"};
        String fileDir = "d:\\newExel.xls";
        List<Map> listMap = new ArrayList<Map>() {
        };
        Map myMap = new HashMap<String, String>();
        myMap.put("7", "b1");
        myMap.put("8", "d1");
        myMap.put("9", "g1");
        Map myMap2 = new HashMap<String, String>();
        myMap2.put("7", "b2");
        myMap2.put("8", "d2");
        myMap2.put("9", "g2");
        Map myMap3 = new HashMap<String, String>();
        myMap3.put("7", "b3");
        myMap3.put("8", "d3");
        myMap3.put("9", "g3");
        listMap.add( myMap );
        listMap.add( myMap2 );
        listMap.add( myMap3 );
        creatExcel( fileDir, sheets, titleNum);
        for(String sheet : sheets){
            try {
                writeToExcel( fileDir ,sheet, listMap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void creatExcel( String fileDir,String[] sheetNames, String[] titleRows ){
        workbook = new HSSFWorkbook();
        for(int i =0;i<sheetNames.length;i++){
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName( i,sheetNames[i] );
            try {
                creatTitleRow( sheetNames[i], titleRows);
                FileOutputStream fileOutputStream = new FileOutputStream( fileDir );
                workbook.write(fileOutputStream);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static  void creatTitleRow( String sheetName, String[] titleRows ){
        HSSFRow row = workbook.getSheet( sheetName ).createRow(0);
        for(short i = 0;i < titleRows.length; i++){
            HSSFCell cell = row.createCell(i);
            cell.setCellValue( titleRows[i] );
        }

    }

    public static void writeToExcel( String fileDir,String sheetName, List<Map> dataJson ) throws IOException {
        System.out.println( dataJson );
        File file = new File( fileDir );
        try {
            workbook = new HSSFWorkbook(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream out = null;
        HSSFSheet sheet = workbook.getSheet( sheetName );
        HSSFRow newRow;
        HSSFCell cell;
        int columnCount = sheet.getRow(0).getLastCellNum();
        HSSFRow titleRow = sheet.getRow(0);
        if( titleRow!=null ){
            for( int i = 0; i< dataJson.size(); i++ ){
                Map map = dataJson.get( i );
                newRow = sheet.createRow(i+1 );
                for(int columnIndex = 0; columnIndex< columnCount; columnIndex++){
                    String mapKey = titleRow.getCell(columnIndex).toString().trim().toString().trim();
                    cell = newRow.createCell(columnIndex);
                    cell.setCellValue( map.get(mapKey)== null ? null : map.get(mapKey).toString() );
                    System.out.println( cell.getStringCellValue() );
                }

            }

        }
        out = new FileOutputStream(fileDir);
        workbook.write(out);

    }
}
