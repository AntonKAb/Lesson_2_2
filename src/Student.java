package com.company;

public class Student {

    private int number;
    private int age;
    private String name;
    private String surName;
    private double averageScore;

    public Student(int number, String name, String surName, int age, double averageScore){

        this.number = number;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.averageScore = averageScore;

    }

    public Student(){

    }
    public void printInfo(Student student){
        if (student.age!=0) {
            System.out.println(student.number + " - Зачетная книжка, " + student.name + " - Имя, "
                            + student.surName + " - Фамилия, " + student.age   + " - Возраст, "
                            + student.averageScore + " - Средний балл.");
        }
        else {
            System.out.println("Не существует стедента с такими параметрами.");
        }

    }


    public int getNumber(){
        return this.number;
    }

    public double getAverageScore(){
        return this.averageScore;
    }
}
