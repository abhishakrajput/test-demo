package com.example.demo;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class MainJsonClass {

  private Map<String, List<String>> filterData;
  private String key;
  private String name;
  private String iconUrl;
  private String gender;

  public Map<String, List<String>> getFilterData() {
    return filterData;
  }

  public void setFilterData(Map<String, List<String>> filterData) {
    this.filterData = filterData;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public MainJsonClass(String gender, String key, String name, String iconUrl, Map<String, List<String>> filterData) {
    super();
    this.filterData = filterData;
    this.key = key;
    this.name = name;
    this.iconUrl = iconUrl;
    this.gender = gender;
  }

}
