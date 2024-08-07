/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rudrprasad.cs214_lab_week_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

/**
 *
 * @author s11219309
 */
public class Cs214_lab_week_3 {

    public static void main(String[] args) {
        // priority queue with printing
        Queue<Student> studentPriorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getGpa().compareTo(t2.getGpa());
            }
        }.reversed());
        LinkedList<Student> studentList = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\s11219309\\Documents\\NetBeansProjects\\cs214_lab_week_3\\src\\main\\java\\com\\rudrprasad\\cs214_lab_week_3\\students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t"); // Assuming the data is tab-separated
                String name = parts[0];
                Double gpa = Double.parseDouble(parts[1]);
                Student student = new Student(name, gpa);
                studentPriorityQueue.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        studentList.addAll(studentPriorityQueue);

        int counter = 0;

        System.out.println("Names according to highest GPA (priority queue)");
        while(!studentPriorityQueue.isEmpty() && counter < 5){
            Student s = studentPriorityQueue.peek();
            if(s.getGpa() >= 4){
                System.out.println(studentPriorityQueue.poll());
                counter++;
            }
            else break;
            
        }

        // tree set. names and gpa printed according to alphabetical order of First name
     

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("Names sorted alphabetically (TreeSet)");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
    
}
