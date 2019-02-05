/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingCompany;

/**
 *
 * @author User
 */
public abstract class Company {
     Employee[] getEmploees(){
        return null;
    };
    
    void startWorking(Employee[] empoeers){
        for (Employee empoeer : empoeers) {
           empoeer.doWork(); 
        }
}
}
