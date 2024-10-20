package com.mehedi.react_tailwind_springboot_quiz_app.service;


import com.mehedi.react_tailwind_springboot_quiz_app.model.Questions;

import java.util.List;

public interface IQuestionService {

    Questions createQuestion(Questions question);

    List<Questions> getAllQuestions();

//    28:00


}
