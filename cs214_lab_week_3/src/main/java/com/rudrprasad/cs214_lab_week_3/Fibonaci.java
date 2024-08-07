/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.cs214_lab_week_3;

/**
 *
 * @author s11219309
 */
public class Fibonaci {
    public static void main(String[] args){
        double startTime = System.nanoTime();
        
        System.out.println(Iterative(1000));
        
        double endTime   = System.nanoTime();
        double totalTime = endTime - startTime;
        System.out.println(totalTime/1_000_000_000 + " second");
        
    }
    
    private static int Recursive(int n){
        if(n <= 1){
            return n;
        }
        else{
            return Recursive(n - 1) + Recursive(n - 2);
        }
    }
    
    private static int Iterative(int n){
        
        int fib = 0;
        int a = 1;
        for(int i=0; i<n; i++) {
            int temp = fib;
            fib = fib + a;
            a = temp;
        }
        return fib;
    
    }
}
