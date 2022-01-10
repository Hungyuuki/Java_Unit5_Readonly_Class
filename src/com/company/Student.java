package com.company;

public class Student {
    private String name ;
    private String classes;

    public Student(){
        String name = "John";
        String classes = "C02";
    }
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

     void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
