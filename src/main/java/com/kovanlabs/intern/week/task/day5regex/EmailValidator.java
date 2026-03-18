package com.kovanlabs.intern.week.task.day5regex;

import java.util.regex.Pattern;

public class EmailValidator {

    private void validateEmail(String email){
        if(email.isEmpty()){
            System.out.println("Email is empty");
        }
        else if(Pattern.matches("^(?![.])[A-Za-z0-9._%+-]+(?<![.])@[A-Za-z0-9-]+(\\.[A-Za-z]{2,})+$",email)){
            System.out.println("Email Valid "+email);
        }
        else{
            System.out.println("Invalid Email"+email);
        }
    }

    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        String[] validEmails = {
                "user@gmail.com",
                "john_99@yahoo.in",
                "hello.world@company.org",
                "test123@domain.co",
                "user+mail@service.net",
                "alpha.beta@edu.com",
                "my_email@site.in",
                "coder123@test.org",
                "name.surname@work.co",
                "abc_xyz@demo.com"
        };
        String[] invalidEmails = {
                "usergmail.com",
                "@gmail.com",
                "user@gmail",
                "user@.com",
                "user@gmail.c",
                "user@@gmail.com",
                "user gmail.com",
                "user#gmail.com",
                ".user@gmail.com",
                "user@domain..com"
        };
        System.out.println("Valid emails:");
        for(String email : validEmails)
            emailValidator.validateEmail(email);
        System.out.println("\nInvalid emails:");
        for(String email : invalidEmails)
            emailValidator.validateEmail(email);
    }

}