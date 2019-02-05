/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

//import Collection.ArrayList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class JavaDeveLopersJobSite implements Observed{
 
    List<String> vacancies = new ArrayList<>();
    
    List<Observer> subscribers = new ArrayList<>();
    
    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObserver();
}
    
   
    @Override
     public void addObserver(Observer observer){
        this.subscribers.add(observer);
        
    }
    @Override
    public void removeObserver(Observer observer){
        this.subscribers.remove(observer);
        
}
    
    @Override
    public void notifyObserver(){
        for(Observer observer:subscribers){
            observer.handleEvent(this.vacancies);
        }
}
}
