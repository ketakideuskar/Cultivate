package com.example.cultivate;

public class Person {
    private String name;
    private String surname;
    private String metro;
    private String language;
    private boolean student;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public void setStudent(boolean isStudent) {
        this.student = isStudent;
    }


}

