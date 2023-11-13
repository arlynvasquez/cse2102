package com.example.demo.service;

public class EmailValidationService{

    public boolean isValid(String email){
        return email.matches("[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:{a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")
    }
}