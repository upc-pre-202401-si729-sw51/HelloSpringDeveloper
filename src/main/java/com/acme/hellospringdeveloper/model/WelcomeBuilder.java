package com.acme.hellospringdeveloper.model;

public class WelcomeBuilder {
    private static String WELCOME_TEMPLATE = "Hello %s!. Now You are and Spring Developer.";

    public static String build(String name) {
        String finalName = name == null ? "Developer" : name;
        return String.format(WELCOME_TEMPLATE, finalName);
    }
}
