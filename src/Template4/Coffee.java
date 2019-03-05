/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Coffee extends HotDrink{
   @Override
   void brew(){
       System.out.println("Завариваем кофе");
   }
   @Override
   boolean customerWantsIngridients(){
       String answer= getUserInput();
       if(answer.toLowerCase().startsWith("y")){
           return true;
       }else{
           return false;
       }
   }
   private String getUserInput(){
       String answer= null;
       System.out.println("Хотите добавить молока? (y/n)");
       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
       try{
           answer= in.readLine();
           
       }catch (IOException ex){
           System.out.println("Error...");
       }
       if(answer==null){
           return "no";
       }
       return answer;
   }
}
