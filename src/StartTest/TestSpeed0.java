/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

/**
 *
 * @author User
 */
public class TestSpeed0 {
    //динамический блок
    { 
    System.out.println("We are in block 1");
}
    static {
    System.out.println("We are in static block");
}
    public TestSpeed0() {
     System.out.println("Constructor has worked");
}
{
    System.out.println("We are last block 2");
}
    public static void main(String[] args) {
      TestSpeed0 test = new TestSpeed0();  
      TestSpeed0 test2 = new TestSpeed0();  
    }
}