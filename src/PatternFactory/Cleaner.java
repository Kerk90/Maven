/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternFactory;

/**
 *
 * @author User
 */
public class Cleaner implements Employee{
    @Override
    public  void doWork() {
        System.out.println("I'm cleaner. I'm cleaning");
    }
}
