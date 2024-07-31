/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudprasad.cs214_lab_week2;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author s11219309
 */
public class Caller {
    private String mobileNumber;
    public Caller(){
        Integer randomNum = ThreadLocalRandom.current().nextInt(1_000_000, 9_999_999 + 1);
        this.mobileNumber = randomNum.toString();
    }
    public String getNumber(){
        return mobileNumber;
    }
    
    @Override
    public String toString(){
        return this.mobileNumber + "\n";
    }
}
