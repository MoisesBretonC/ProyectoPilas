/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Berke
 */
public class Data <T>{
    private T value;
   
    public Data(T v){
        this.value = v;
    }
    public T getValue(){
        return value;
    }
    public void setValue (T value){
        this.value = value;
    }
    
}
