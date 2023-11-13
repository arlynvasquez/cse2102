package com.example.demo.service;

import com.example.demo.model.QuizQuestion;
import java.util.ArrayList;
import java.util.List;

public class QuizService{

    public List<QuizQuestion> getQuestionsForTopic (String topic){
        List<QuizQuestion> questions = mew ArrayList<>();
        //filler questions
        questions.add(new Questions("1. What is 21+32?", new String[]{"52, 63, 53, 67"}, "53"));
        questions.add(new Questions("2. What is the capital of New York?", new String[]{"Manhattan, New York City, Albany, Buffalo"}, "Albany"));
        questions.add(new Questions("3. Which planet is closest to the sun?", new String[]{"Venus, Earth, Mars, Mercury"}, "Mercury"));
    }
    return questions;
}