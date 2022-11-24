/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Berke
 */
public class Stack {
    private ArrayList <Data> stack;
    private int top;
    
    public Stack (){
        stack = new ArrayList(t);
        top = stack.size();
        
    }
    
    public boolean isEmpty(){
        if (top == stack.size())
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top ==0)
            return true;
        else
            return false;
    }
}
