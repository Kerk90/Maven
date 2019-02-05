/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingCompany;

//import PatternFactory.CleanerCompany;
//import PatternFactory.GameDevCompany;

/**
 *
 * @author User
 */
public class Main {
     public static void main(String[] args) {
        Company buildCompany = new BuilderCompany();
        Employee[] computerWorkers = buildCompany.getEmploees();
        buildCompany.startWorking(computerWorkers);
        
       
    }
}
