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
public class Main {
    public static void main(String[] args) {
        Company gameCompany = new GameDevCompany();
        Employee[] computerWorkers = gameCompany.getEmployee();
        gameCompany.startWorking(computerWorkers);
        
       
    }
}
