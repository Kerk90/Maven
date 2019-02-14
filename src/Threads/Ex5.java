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
public class Ex5 {

    static class Recipe implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.err.println(Thread.currentThread().getName() + "...gotovit..." + i);

            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();
        System.err.println(Thread.currentThread().getName());
        new Tgread(new Recipe()).start();
        new Tgread(new Recipe()).start();
        new Tgread(new Recipe()).start();
    }
}
