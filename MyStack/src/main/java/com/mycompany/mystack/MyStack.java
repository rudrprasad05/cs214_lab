/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mystack;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 *
 * @author s11219309
 */
//import java.util.Vector;
//import java.util.EmptyStackException;


class MyStack implements Cloneable{
  private Vector items;

  public MyStack() {
    items = new Vector();
  }

  public Object push(Object item) {
    items.addElement(item);
    return item;
  }
  
   @Override
  public MyStack clone() throws CloneNotSupportedException {
    try {
      MyStack cloned = (MyStack) super.clone();
      cloned.items = (Vector<Object>) this.items.clone();
      return cloned;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
  
  public Object pop() {
    Object	obj;
    int	len = items.size();
    obj = peek();
    items.removeElementAt(len - 1);
    return obj;
  }

  public Object peek() {
    int	len = items.size();
    if (len == 0)
      throw new EmptyStackException();
    return items.elementAt(len - 1);
  }

  public int size() {
    return items.size();
  }

  public String toString() {
    return items.toString();
  }


  public static void main(String[] args) throws CloneNotSupportedException {
    MyStack intStack = new MyStack();
    MyStack strStack = new MyStack();
    
    intStack.push(11);
    intStack.push(25);
    intStack.push(89);
    
    strStack.push("I");
    strStack.push("Love");
    strStack.push("Java");
    
    MyStack s1 = new MyStack();
    
    s1.push("I");
    s1.push("Love");
    
    MyStack s2 = (MyStack) s1.clone();
    System.out.println("s1: " + s1.toString());
    System.out.println("s2: " + s2.toString());
    
    s2.push("Java");
    s1.push("CS214");
    System.out.println("s1: " + s1.toString());
    System.out.println("s2: " + s2.toString());
    
    s2.push("Bye");
    System.out.println("s1: " + s1.toString());
    System.out.println("s2: " + s2.toString());
  }
}