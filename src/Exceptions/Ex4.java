/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

class MyClass {

    
        public  void myMethod()throws Exception{
        Exception exception = new Exception("Мое исключение");
        throw exception;
    }

}

/**
 *
 * @author User
 */
public class Ex4 {

    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();

        } catch (Exception e) {
            System.out.println("Message " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
