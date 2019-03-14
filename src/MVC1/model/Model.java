/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author user
 */
public class Model extends Observable{
    public List<String>data;
    public Model(){
        data=new ArrayList<>();
        
    }
    public void addDatum(String datum){
        data.add(datum);
        setChanged();
        notifyObservers();
    }
  public String get(int index){
      return data.get(index);
  }
  public int size(){
      return data.size();
  }
}
