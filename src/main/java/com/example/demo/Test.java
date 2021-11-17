package com.example.demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

class TestDataYear
{
  private int startingYear;

  private int startingMonth;

  private int endingYear;

  private int endingMonth;

  public int getStartingYear() {
    return startingYear;
  }

  public void setStartingYear(int startingYear) {
    this.startingYear = startingYear;
  }

  public int getStartingMonth() {
    return startingMonth;
  }

  public void setStartingMonth(int startingMonth) {
    this.startingMonth = startingMonth;
  }

  public int getEndingYear() {
    return endingYear;
  }

  public void setEndingYear(int endingYear) {
    this.endingYear = endingYear;
  }

  public int getEndingMonth() {
    return endingMonth;
  }

  public void setEndingMonth(int endingMonth) {
    this.endingMonth = endingMonth;
  }

  public TestDataYear(int startingYear, int startingMonth, int endingYear, int endingMonth) {
    super();
    this.startingYear = startingYear;
    this.startingMonth = startingMonth;
    this.endingYear = endingYear;
    this.endingMonth = endingMonth;
  }

  
  
  
  
}


public class Test {
  static int totalExp;

  public static void main(String[] args) {

    List<TestDataYear> list = new ArrayList<>();

    TestDataYear t1 = new TestDataYear(2025, 50, 2020, 3);
//    TestDataYear t2 = new TestDataYear(2006, 10, 2013, 1);
    list.add(t1);
//    list.add(t2);
    System.out.println(findTotalExperience(list));

    LocalDate firstDate = LocalDate.of(2020, 7, 01);
    LocalDate seconDate = LocalDate.of(2021, 10, 01);
    if(firstDate.isBefore(seconDate)) {
      Period period = Period.between(firstDate, seconDate);
      int years = Math.abs(period.getYears());
      int months = Math.abs(period.getMonths());
      if(years>0) {
        months=months+(years*12);
      }
      System.out.println(months);
    }
  }

  public static String findTotalExperience(List<TestDataYear> list) {

    list.forEach(testDataYear -> {
      
    });
    totalExp = 5600;
    String totalExperience = Integer.toString(totalExp / 12).concat(".").concat(Integer.toString(totalExp % 12));

//    list.forEach(data->{
//      Date d1 = new  D
//    });
    
    return totalExperience;

  }
  
  
 
}
