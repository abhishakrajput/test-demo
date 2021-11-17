package com.example.demo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CategoryFilterDataBuild {
  public static void main(String[] args) {
    List<MainJsonClass> mainArray = new ArrayList<MainJsonClass>();
    try {
      String path = "/home/sixsprints/wardo_task/Master_Data/Category_filter/filter.xlsx";
      FileWriter fw = new FileWriter("/home/sixsprints/wardo_task/Master_Data/Category_filter/filter.json");

      XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(path));
      XSSFSheet sh = wb.getSheetAt(0);
      XSSFCell cell = null;
      int firstRowIndex = 0;
      XSSFRow firstRow = sh.getRow(firstRowIndex);
      XSSFRow row = null;
      int totalColum = firstRow.getLastCellNum();
      int countrow = sh.getLastRowNum();
      int rowNumber = 0;
      String firstColRowValue = "";
      LinkedHashMap<String, Integer> columnValueWiseIndex = new LinkedHashMap<String, Integer>();
      String oldCatagory = "";
      Map<String, List<String>> data = new LinkedHashMap<>();

      for (int ii = 0; ii <= countrow; ii++) {
        row = sh.getRow(ii);
        if (row != null) {
          rowNumber = row.getRowNum();
          if (ii == 0) {
            for (int i = ii; i < ((int) row.getLastCellNum()); i++) {
              cell = row.getCell((short) i);
              columnValueWiseIndex.put(cell.getStringCellValue(), i);
            }
          } else {
            boolean movetoNextCategory = true;
            cell = row.getCell((short) 0);
            if (cell == null) {
              continue;
            }

            String rowCategory = cell.getStringCellValue();
            if (oldCatagory.equalsIgnoreCase("") || oldCatagory.equalsIgnoreCase(rowCategory)) {
              movetoNextCategory = false;
            }
            if (movetoNextCategory) {
              MainJsonClass mainJsonClass = new MainJsonClass("MALE", oldCatagory, oldCatagory, "", data);
              mainArray.add(mainJsonClass);
              data = new LinkedHashMap<>();
            }
            oldCatagory = rowCategory;

            int styleAIndex = columnValueWiseIndex.get("STYLE");
            cell = row.getCell((short) styleAIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("STYLE")) {
                styleData = data.get("STYLE");
                styleData.add(cell.getStringCellValue());
                data.put("STYLE", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("STYLE", styleData);
              }

            }

            // for pattern

            int patternAIndex = columnValueWiseIndex.get("PATTERN");
            cell = row.getCell((short) patternAIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("PATTERN")) {
                styleData = data.get("PATTERN");
                styleData.add(cell.getStringCellValue());
                data.put("PATTERN", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("PATTERN", styleData);
              }

            }

            // TYPE

            int TYPEIndex = columnValueWiseIndex.get("TYPE");
            cell = row.getCell((short) TYPEIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("TYPE")) {
                styleData = data.get("TYPE");
                styleData.add(cell.getStringCellValue());
                data.put("TYPE", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("TYPE", styleData);
              }

            }

            // FABRIC

            int fabricIndex = columnValueWiseIndex.get("FABRIC");
            cell = row.getCell((short) fabricIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("FABRIC")) {
                styleData = data.get("FABRIC");
                styleData.add(cell.getStringCellValue());
                data.put("FABRIC", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("FABRIC", styleData);
              }

            }

            // SLEEVE

            int sleeveIndex = columnValueWiseIndex.get("SLEEVE");
            cell = row.getCell((short) sleeveIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("SLEEVE")) {
                styleData = data.get("SLEEVE");
                styleData.add(cell.getStringCellValue());
                data.put("SLEEVE", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("SLEEVE", styleData);
              }

            }

            // NECKLINE

            int NECKLINEIndex = columnValueWiseIndex.get("NECKLINE");
            cell = row.getCell((short) NECKLINEIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("NECKLINE")) {
                styleData = data.get("NECKLINE");
                styleData.add(cell.getStringCellValue());
                data.put("NECKLINE", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("NECKLINE", styleData);
              }

            }

            // Length

            int LengthIndex = columnValueWiseIndex.get("Length");
            cell = row.getCell((short) LengthIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              List<String> styleData = new ArrayList<String>();
              if (data.containsKey("Length")) {
                styleData = data.get("Length");
                styleData.add(cell.getStringCellValue());
                data.put("Length", styleData);
              } else {
                styleData = new ArrayList<String>();
                styleData.add(cell.getStringCellValue());
                data.put("Length", styleData);
              }

            }

          }
        }

      }

      ObjectMapper objectMapper = new ObjectMapper();
      String data1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mainArray);
      System.out.println();
      fw.write(data1);

      // System.out.println(mainArray);
      // fw.write(mainArray.toString());
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
