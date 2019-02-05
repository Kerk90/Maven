/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingCompany;

//import PatternFactory.Cleaner;
//import PatternFactory.CleanerCompany;

/**
 *
 * @author User
 */
public class BuilderCompany  extends Company{
    Employee[] getEmployees(){
    System.out.println("");
    System.out.println("Sarting company builder "+BuilderCompany.class.getSimpleName()+"\n");
    Employee[] employee = new BuildingCompany.Employee[12];
    employee[0] = new Electrician();
    employee[1] = new Manager();
    employee[2] = new Director();
    employee[3] = new Builder(); 
    employee[4] = new Builder(); 
    employee[5] = new Builder(); 
    employee[6] = new Builder(); 
    employee[7] = new Builder(); 
    employee[8] = new Builder(); 
    employee[9] = new Builder(); 
    employee[10] = new Builder(); 
    employee[11] = new Builder(); 
    employee[12] = new Builder(); 
    employee[13] = new Builder(); 
    return employee;
}
    
}
