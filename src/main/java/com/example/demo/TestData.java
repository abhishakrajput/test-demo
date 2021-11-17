package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestData {
public static void main(String[] args) {
  String data="[{name: 'Porcelain', color: '#F2D5BD', isSelected: false},\n"
    + "{name: 'Ivory', color: '#ECCFAC', isSelected: false},\n"
    + "{name: 'Beige', color: '#E2CA9F', isSelected: false},\n"
    + "{name: 'Warm Beige', color: '#DCB381', isSelected: false},\n"
    + "{name: 'Golden', color: '#C49254', isSelected: false},{name: 'Almond', color: '#BA814E', isSelected: false},\n"
    + "{name: 'Warm Ivory', color: '#EFC493', isSelected: false},\n"
    + "{name: 'Sand', color: '#D8BA93', isSelected: false},\n"
    + "{name: 'Natural', color: '#D8A978', isSelected: false},\n"
    + "{name: 'Honey', color: '#CE955B', isSelected: false},\n"
    + "{name: 'Chestnut', color: '#AA713E', isSelected: false},\n"
    + "{name: 'Espresso', color: '#82522B', isSelected: false}]";
  JSONArray buildarray = new JSONArray();
  JSONArray array = new JSONArray(data);
  for(int i=0;i<array.length();i++) {
    JSONObject buildJson = new JSONObject();
    JSONObject json = array.getJSONObject(i);
    buildJson.put("key", json.get("color"));
    buildJson.put("value", json.get("name"));
    buildarray.put(buildJson);
  }
System.out.println(buildarray);  
  
}
}
