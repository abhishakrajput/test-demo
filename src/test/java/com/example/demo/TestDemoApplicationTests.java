package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.testingstuff.Question;
import com.example.demo.testingstuff.QuestionNew;
import com.example.demo.testingstuff.QuestionRepository;
import com.example.demo.testingstuff.QuestionService;
import static org.mockito.Mockito.*;

@SpringBootTest
class TestDemoApplicationTests {

  @Test
  void contextLoads() {
    assertThat(Boolean.TRUE).isTrue();
  }

  @MockBean
  private QuestionRepository repository;

  @Autowired
  private QuestionService service;

  @Test
  public void createData() {
    Question question = new Question();
    question.setQtext("testing");
    QuestionNew newQuestion = new QuestionNew();
    newQuestion.setAnswer("myansermock");
    when(repository.createQuestion(question)).thenReturn(newQuestion);
   // when(repository.createQuestion(any(Question.class)))
    // when(injectService.createQuestion(question)).thenReturn(question);
    //when(repository.createQuestion(any(Class.class))).thenReturn(newQuestion);
  //  when(repository.createQuestion(question)
   // when(repository.createQuestion(any(Question.class))).thenReturn(new QuestionNew());
    
    QuestionNew ne = service.createQuestion(question);
    assertNotNull(ne);
    assertEquals(ne.getAnswer(), "myansermock");
    //assertThat(ne).is(notNull());
     //assertEquals(newQuestion ,ne);
  }
  
  @Test
  public void exceptionTest() {
    QuestionNew newQuestion = new QuestionNew();
    newQuestion.setAnswer("myansermock");
    Question question = new Question();
    question.setQtext("hello");
    when(repository.createQuestion(question)).thenReturn(newQuestion);
    assertThrows(RuntimeException.class, ()->{service.createQuestion(question);});
  }

}
