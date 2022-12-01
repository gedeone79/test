package com.quicktutorials.learnmicroservices.utils;

public class UserNotLoggedException extends Exception {

    public UserNotLoggedException(String errorMessage) {
        super(errorMessage);
    }
}
