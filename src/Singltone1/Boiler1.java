/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singltone1;

/**
 *
 * @author User
 */
public class Boiler1 {
    
    private boolean empty;
    private boolean boiled;

    /*public Boiler1() {
        empty = true;
        boiled = false;
        System.out.println("new Boiler created");
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Boiler is filled");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Boiler is empty");
        }
    }

    public void boil() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
            System.out.println("boiling..");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}*/
public static Boiler1 uniqueInstance;

private Boiler1() {

}
public static Boiler1 getInstance() {
if (uniqueInstance == null) {
uniqueInstance = new Boiler1(); //
System.out.println("The new instance of Boiler");
}
System.out.println("Returning instance...");
return uniqueInstance;
}
    }
