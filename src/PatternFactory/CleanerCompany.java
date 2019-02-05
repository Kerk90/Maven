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
public class CleanerCompany extends Company{
    @Override
    Employee[] getEmployee(){
    System.out.println("");
    System.out.println("Sarting company cleanering "+CleanerCompany.class.getSimpleName()+"\n");
    Employee[] employee = new Employee[4];
    employee[0] = new Cleaner();
    employee[1] = new Cleaner();
    employee[2] = new Cleaner();
    employee[3] = new Manager();
    
    return employee;
}
}
