/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template2;

/**
 *
 * @author user
 */
public abstract class HotDrink {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addIngridient();
    }
    abstract void brew();
    
    abstract void addIngridient();
    
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup ");
    }

   
    public void addIngridient(){
        System.out.println("Adding lemon into cup ");
    }
    
}
