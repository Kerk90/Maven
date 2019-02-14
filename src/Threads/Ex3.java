/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author User
 */
public class Ex3 {

    static class Recipe implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ex3.class.getName()).log(Level.SEVERE, null, ex);

            }
            System.err.println("..gotovim po recepty...");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();
    }
}
