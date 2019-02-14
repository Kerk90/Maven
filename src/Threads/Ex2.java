/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author User
 */
public class Ex2 {

    static class Recipe implements Runnable {

        @Override
        public void run() {
            System.out.println("...gotovim po recety..");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();
        
        thread.setName("Cook");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());

    }
}
