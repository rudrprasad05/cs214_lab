/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rudprasad.cs214_lab_week2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author s11219309
 */
public class Cs214_lab_week2 {

    public static void main(String[] args) {
        Queue<Caller> callerQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        
        while(isRunning){
            System.out.println("\nWelcome to Anz Call Center");
            System.out.println("Menu \n1. Add New Caller \n2. View All Callers \n3. Pick Up Phone (remove caller) \n4. Exit");
            String menuInput = input.nextLine();
            
            switch(menuInput){
                case "1": 
                    AddNewCaller(callerQueue);
                    break;
                case "2":
//                    ViewCallers(callerQueue);
                    for(Caller caller : callerQueue){
                        System.out.print(caller);
                    }
                    System.out.println("Total callers: " + callerQueue.size());
                    break;
                case "3":
                    RemoveCaller(callerQueue);
                    break;
                case "4":
                    isRunning = false;
                    break;
                default: 
                    System.out.println("Invalid Input");
            }
        }
        
        System.out.println("Exiting Programme");
        
    }
    
    private static void AddNewCaller(Queue callers){
        Caller newCaller = new Caller();
        callers.add(newCaller);
    }
    
    private static void ViewCallers(Queue<Caller> callers){
        
        System.out.println("Total Callers: " + callers.size());
    }
    
    private static void RemoveCaller(Queue callers){
        callers.remove();
        System.out.println("Call was picked up, removed from queue. Callers left: " + callers.size());
    }
}
