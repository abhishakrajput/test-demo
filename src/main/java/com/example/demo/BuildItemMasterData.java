package com.example.demo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BuildItemMasterData {
  public static void main(String[] args) throws IOException {
    String path = "/home/sixsprints/wardo_task/Master_Data/itemMasterData/FinalData_For SixSprints 29 June.xlsx";
    FileWriter fw = new FileWriter("/home/sixsprints/wardo_task/Master_Data/itemMasterData/29_june.json");
    XSSFRow row = null;
    XSSFWorkbook wb;

    try {
      wb = new XSSFWorkbook(new FileInputStream(path));
      XSSFSheet sh = wb.getSheetAt(0);
      int countrow = sh.getLastRowNum();
      XSSFCell cell = null;
      LinkedHashMap<String, Integer> columnValueWiseIndex = new LinkedHashMap<String, Integer>();
      List<ItemMasterDto> itemMasterDtos = new ArrayList<>();
      for (int ii = 0; ii <= countrow; ii++) {
        row = sh.getRow(ii);
        if (row != null) {

          if (row != null) {
            if (ii == 0) {
              // setup column index and read First Row Data

              for (int i = ii; i < ((int) row.getLastCellNum()); i++) {
                cell = row.getCell((short) i);
                columnValueWiseIndex.put(cell.getStringCellValue(), i);
              }

            } else {
              // Rest Row
              System.out.println(ii);
              boolean movetoNextCategory = true;
              cell = row.getCell((short) 0);
              if (cell == null) {
                continue;
              }
              String status = cell.getStringCellValue();
              if (status.equals("no")) {
                movetoNextCategory = false;
              }
              String parentCatgeory = "";
              String mainCategory = "";
              String referredCategory = "";
              String imageUrl = "";

              int parrentCategoryIndex = columnValueWiseIndex.get("ParentCatgeory");
              cell = row.getCell((short) parrentCategoryIndex);
              if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                parentCatgeory = cell.getStringCellValue();
              }

              // for Main

              int mainCategoryIndex = columnValueWiseIndex.get("MainCategory");
              cell = row.getCell((short) mainCategoryIndex);
              if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                mainCategory = cell.getStringCellValue();
              }

              // for referred By

              int referredCategoryIndex = columnValueWiseIndex.get("ReferredCategory");
              cell = row.getCell((short) referredCategoryIndex);
              if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                referredCategory = cell.getStringCellValue();
              }

              String itemName = "";
              int itemNameIndex = columnValueWiseIndex.get("ItemName");
              cell = row.getCell((short) itemNameIndex);
              if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                itemName = cell.getStringCellValue();
              }

              String gender = "";
              int genderIndex = columnValueWiseIndex.get("Gender");
              cell = row.getCell((short) genderIndex);
              if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                gender = cell.getStringCellValue();
              }

              Boolean isVariant = false;
              int isVariantIndex = columnValueWiseIndex.get("isVariant");
              cell = row.getCell((short) isVariantIndex);
              if (cell != null
                ) {
                try {
                  isVariant = cell.getBooleanCellValue();
                } catch (Exception e) {
                  isVariant = Boolean.parseBoolean(cell.getStringCellValue());
                }

                int colorGroupId = 0;
                int colorGroupIdIndex = columnValueWiseIndex.get("ColorGroupId");
                cell = row.getCell((short) colorGroupIdIndex);
                if (cell != null ) {
                  colorGroupId = (int) cell.getNumericCellValue();
                }

                String ColorCode = "";
                int ColorCodeIndex = columnValueWiseIndex.get("ColorCode");
                cell = row.getCell((short) ColorCodeIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  ColorCode = cell.getStringCellValue();
                }

                int imageUrlIndex = columnValueWiseIndex.get("imageUrl");
                cell = row.getCell((short) imageUrlIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  imageUrl = cell.getStringCellValue();
                  if(imageUrl.contains(" ")) {
                    imageUrl = imageUrl.replace(" ", "+");
                  }
                }

                String fabric = "";
                int fabricIndex = columnValueWiseIndex.get("Fabric");
                cell = row.getCell((short) fabricIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  fabric = cell.getStringCellValue();
                }

                String pattern = "";
                int patternIndex = columnValueWiseIndex.get("Pattern");
                cell = row.getCell((short) patternIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  pattern = cell.getStringCellValue();
                }

                String style = "";
                int styleIndex = columnValueWiseIndex.get("Style");
                cell = row.getCell((short) styleIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  style = cell.getStringCellValue();
                }

                String type = "";
                int typeIndex = columnValueWiseIndex.get("Type");
                cell = row.getCell((short) typeIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  type = cell.getStringCellValue();
                }

                String sleeve = "";
                int sleeveIndex = columnValueWiseIndex.get("Sleeves");
                cell = row.getCell((short) sleeveIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  sleeve = cell.getStringCellValue();
                }

                String neckline = "";
                int necklineIndex = columnValueWiseIndex.get("Neckline");
                cell = row.getCell((short) necklineIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  neckline = cell.getStringCellValue();
                }

                String length = "";
                int lengthIndex = columnValueWiseIndex.get("Length");
                cell = row.getCell((short) lengthIndex);
                if (cell != null && cell.getStringCellValue() != null && !cell.getStringCellValue().equalsIgnoreCase("")
                  && !cell.getStringCellValue().equalsIgnoreCase("NA")) {
                  length = cell.getStringCellValue();
                }

                // build data

                ItemMasterDto dto = new ItemMasterDto();
                dto.setGender(gender);
                dto.setParentCategoryName(parentCatgeory);
                dto.setCategoryName(mainCategory);
                dto.setReferredCategoryName(referredCategory);
                dto.setItemName(itemName);
                dto.setItemImageUrl(imageUrl);
                dto.setColorGroupId(colorGroupId + "");
                dto.setColorCode(ColorCode);
                dto.setItemImageUrl(imageUrl);
                dto.setIsVariant(isVariant);
                dto.setPattern(pattern);
                dto.setFabric(fabric);
                dto.setType(type);
                dto.setSleeve(sleeve);
                dto.setNeckline(neckline);
                dto.setStyle(style);
                dto.setLength(length);
                itemMasterDtos.add(dto);

              }

            }

          }

        }

      }

      ObjectMapper objectMapper = new ObjectMapper();
      String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(itemMasterDtos);
      System.out.println();
      fw.write(data);
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
