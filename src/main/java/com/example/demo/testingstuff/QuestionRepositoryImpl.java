package com.example.demo.testingstuff;

import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepositoryImpl implements QuestionRepository  {

  @Override
  public QuestionNew createQuestion(Question question) {
    System.out.println("dao layer call");
    QuestionNew newQuestion = new QuestionNew();
    newQuestion.setAnswer("tes");
    return  newQuestion;
  }

}
