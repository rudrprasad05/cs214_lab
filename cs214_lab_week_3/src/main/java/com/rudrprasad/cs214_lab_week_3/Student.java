/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.cs214_lab_week_3;

public class Student implements Comparable<Student>{
    private final String name;
    private final Double gpa;

    public Student(String name, Double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public Double getGpa(){
        return gpa;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " + gpa;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
