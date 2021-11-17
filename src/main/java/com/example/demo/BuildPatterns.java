package com.example.demo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BuildPatterns {
public static void main(String[] args) {
  String path = "/home/sixsprints/wardo_task/Wardo_acc/patterns.xlsx";
  //FileWriter fw = new FileWriter("/home/sixsprints/wardo_task/item_master_final.json");
  XSSFRow row = null;
  XSSFWorkbook wb;
  List<PreferencesGenericDtoWithImage> imageList =new  ArrayList<>();
  try {
    wb = new XSSFWorkbook(new FileInputStream(path));
    XSSFSheet sh = wb.getSheetAt(0);
    int countrow = sh.getLastRowNum();
    XSSFCell cell = null;
    for (int ii = 0; ii <= countrow; ii++) {
      PreferencesGenericDtoWithImage image =new PreferencesGenericDtoWithImage();
      row = sh.getRow(ii);
      if (row != null) {

        if (row != null) {
            cell = row.getCell((short) 0);
            if (cell == null) {
              continue;
            }
            String status = cell.getStringCellValue();
            String first = "";
            String Second = "";

            int firstIndex = 0;
            int secondIndex=1;
            cell = row.getCell((short) firstIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              first = cell.getStringCellValue();
            }
            cell = row.getCell((short) secondIndex);
            if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
              && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
              Second = cell.getStringCellValue();
            }
            image.setIconUrl(Second);
            image.setKey(first);
            image.setValue(first);
            imageList.add(image);

        }
        }
  }
    ObjectMapper objectMapper = new ObjectMapper();
    String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(imageList);
    System.out.println(data);

  }
  catch(Exception e) {
    e.printStackTrace();
  }
}
}
