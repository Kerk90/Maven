/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author User
 */
public class Ex8 {

    public static void main(String[] args) {
        try {
            System.out.println("Hello!");
        } finally {
            System.out.println("Block finally.");
        }
        System.out.println("End code.");
    }
}
