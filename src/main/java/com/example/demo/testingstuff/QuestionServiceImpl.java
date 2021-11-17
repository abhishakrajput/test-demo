package com.example.demo.testingstuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired
  private QuestionRepository repository;

  @Override
  public QuestionNew createQuestion(Question question) {
    // TODO Auto-generated method stub
    System.out.println("service layer  call");
    if(question.getQtext().equalsIgnoreCase("hello")) {
      throw new RuntimeException("Exception");
    }
    try {
      int a=5/0;  
      System.out.println("h");
      System.out.println("a");
      System.out.println("a");
      System.out.println("a");
    }catch (ArithmeticException e) {
      System.out.println("Throw number format Exception");
      e.printStackTrace();
    }
    
    System.out.println("h");
    System.out.println("a");
    System.out.println("a");
    System.out.println("a");
  

  
  return    repository.createQuestion(question);
  }

}
