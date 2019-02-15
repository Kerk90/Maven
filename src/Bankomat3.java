
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Bankomat3 {

    static int money = 100;
    static Object key = new Object();

    static void getMoney(int amount) {
        synchronized (key) {

            if (amount <= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Bankomat3.class.getName()).log(Level.SEVERE, null, ex);
                }
                money -= amount;
                System.out.println("Cograt! new amount: " + money);
            } else {
                System.err.println("Not enough money!");
            }
        }
        System.out.println("...done... ");

    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat2.getMoney(30);
        }).start();
        new Thread(() -> {
            System.out.println("Peya: ");
            Bankomat2.getMoney(30);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat2.getMoney(30);
        }).start();
    }
}
