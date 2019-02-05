
package Company2;

//import TestFactory.Company;
//import TestFactory.Programmer;
//import TestFactory.Tester;


public class Company_2 {
    void createSoftware(){
        System.out.println("Starting company activity");
        Employee[] employee = new Employee[3];
        employee[0] = new Designer();
        employee[1] = new Programmer();
        employee[2] = new Tester();
        
        for (Employee employeeEach : employee){
            employeeEach.doWork();
}
    }
}
