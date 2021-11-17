package com.example.demo;

import java.util.Calendar;
import java.util.Date;

public class DateData {
public static void main(String[] args) {
  Calendar c = Calendar.getInstance();
  
  // set Month
  // MONTH starts with 0 i.e. ( 0 - Jan)
  c.set(Calendar.MONTH, 9);

  // set Date
  c.set(Calendar.DATE, 03);

  // set Year
  c.set(Calendar.YEAR, 2021);

  // creating a date object with specified time.
  Date dateOne = c.getTime();
  System.out.println(dateOne);
  
 System.out.println(new  Date().after(dateOne));
}
}
