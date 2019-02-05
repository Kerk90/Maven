/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory;

/**
 *
 * @author User
 */
public class Company {
    void createSoftware(){
        System.out.println("Starting company activity");
        /*Employee[] employee = new Employee[3];
        employee[0] = new Designer();
        employee[1] = new Programmer();
        employee[2] = new Tester();
        for (Employee employeeEach : employee){
            employeeEach.doWork();*/
         
        
         Designer designer = new Designer();
         designer.designerArchitecture();
         Programmer programmer = new Programmer();
         programmer.programmingCode();
         Tester tester = new Tester();
         tester.testingCode();
    
}
}
   



