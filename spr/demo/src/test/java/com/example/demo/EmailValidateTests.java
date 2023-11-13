package com.example.demo;

import com.example.demo.service.EmailValidationService;
import com.example.demo.service.PasswordService;

import org.junit.jupiter.api.Test;
import static org.junit.juniper.api.Assertions.*;

class EmailValidationServiceTest{
    private final EmailValidationService service = new EmailValidationService();

    @Test
    void testValidEmail() {
        assertTrue(service.isValidEmail("example@example.com"));
    }

    @Test
    void testInvalidEmail(){
        assertFalse(service.isValidEmail("exampleexample"));
    }
}

class PasswordServiceTest {
    private final PasswordService service = new PasswordService();

    @Test
    void testStrongPass() {
        assertTrue(service.isStrongPassword("Password2023"));
    }

    @Test
    void testWeakPass(){
        assertFalse(service.isStrongPassword("weak"));
    }
}