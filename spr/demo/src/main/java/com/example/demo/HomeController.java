package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.LoginCredentials;
import com.example.demo.service.PasswordService;
import com.example.demo.service.EmailValidationService;
import com.example.demo.model.Questions;
import com.example.demo.QuizService;

import java.util.List;

@Controller
public class HomeController {

    private final EmailValidationService emailValidationService = new EmailValidationService();
    private final PasswordService passwordService = new PasswordService();
    private final QuizService quizService = new QuizService();
    @GetMapping("/")
    public String login(@ModelAttribute LoginCredentials loginCredentials, Model model) {
        model.addAttribute("loginCredentials", new LoginCredentials());
        model.addAttribute("emailK", true);
        model.addAttribute("passK", true);
        boolean validEmail = emailValidationService.isValidEmail(loginCredentials.getEmail());
        boolean strongPass = passwordService.isStrongPassword(loginCredentials.getPassword());

        if (validEmail && strongPass){
            return "redirect:https//adv22001-vm.cse.uconn.edu/proxy/8092/home";
        } else{
            model.addAttribute("emailK");
            model.addAttribute("passK");
            model.addAttribute("loginCredentials", loginCredentials);
        }
        return "login";
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {
        final Questionlist questionlist = new QuestionList();
        final ArrayList<Question> questions = questionList.getQuestions();
        model.addAttritbute("questions", questions);
        return "quiz";
    }
}