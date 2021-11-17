package com.example.demo;

import java.io.Serializable;

public class ItemMasterDto implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private String gender;

  private String parentCategoryName;

  private String categoryName;

  private String referredCategoryName;

  private String itemName;

  private String itemImageUrl;

  private String colorGroupId;

  private String colorCode;

  private Boolean isVariant;

  private String pattern;

  private String fabric;

  private String type;

  private String sleeve;

  private String neckline;

  private String style;

  private String length;

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getParentCategoryName() {
    return parentCategoryName;
  }

  public void setParentCategoryName(String parentCategoryName) {
    this.parentCategoryName = parentCategoryName;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getReferredCategoryName() {
    return referredCategoryName;
  }

  public void setReferredCategoryName(String referredCategoryName) {
    this.referredCategoryName = referredCategoryName;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemImageUrl() {
    return itemImageUrl;
  }

  public void setItemImageUrl(String itemImageUrl) {
    this.itemImageUrl = itemImageUrl;
  }

  public String getColorGroupId() {
    return colorGroupId;
  }

  public void setColorGroupId(String colorGroupId) {
    this.colorGroupId = colorGroupId;
  }

  public String getColorCode() {
    return colorCode;
  }

  public void setColorCode(String colorCode) {
    this.colorCode = colorCode;
  }

  public Boolean getIsVariant() {
    return isVariant;
  }

  public void setIsVariant(Boolean isVariant) {
    this.isVariant = isVariant;
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public String getFabric() {
    return fabric;
  }

  public void setFabric(String fabric) {
    this.fabric = fabric;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSleeve() {
    return sleeve;
  }

  public void setSleeve(String sleeve) {
    this.sleeve = sleeve;
  }

  public String getNeckline() {
    return neckline;
  }

  public void setNeckline(String neckline) {
    this.neckline = neckline;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "ItemMasterDto [gender=" + gender + ", parentCategoryName=" + parentCategoryName + ", categoryName="
      + categoryName + ", referredCategoryName=" + referredCategoryName + ", itemName=" + itemName + ", itemImageUrl="
      + itemImageUrl + ", colorGroupId=" + colorGroupId + ", colorCode=" + colorCode + ", isVariant=" + isVariant
      + ", pattern=" + pattern + ", fabric=" + fabric + ", type=" + type + ", sleeve=" + sleeve + ", neckline="
      + neckline + ", style=" + style + ", length=" + length + "]";
  }

  
  
  
}
